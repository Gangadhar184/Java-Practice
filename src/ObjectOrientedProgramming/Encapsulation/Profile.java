package ObjectOrientedProgramming.Encapsulation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Profile {
    private String profileId;
    private PersonalInfo personalInfo;
    private List<WorkExp> workHistory;
    private List<Skill> skills;
    private PrivacySettings privacySettings;

    //encap business logic
    private boolean isExpRelevant(WorkExp exp, String industry) {
        return exp.getIndustry().equals(industry) || exp.getDuration.isAfter(LocalDate.now().minusYears(5));
    }

    // public interface with privacy controls
    public List<WorkExp> getRelevantExp(String industry, User requester) {
        if(!privacySettings.canViewWorkHistory(requester)){
            return Collections.emptyList();
        }
        return workHistory.stream().filter(exp -> isExpRelevant(exp, industry)).collect(Collectors.toList());
    }

    //controlled updates with validation
    public boolean addWorkExp(WorkExp exp) {
        if(validateWorkExp(exp)){
            workHistory.add(exp);
            notify();
            return true;
        }
        return false;
    }
}
