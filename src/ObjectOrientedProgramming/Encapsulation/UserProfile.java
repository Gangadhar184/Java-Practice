//package ObjectOrientedProgramming.Encapsulation;
//
//import java.lang.reflect.MalformedParameterizedTypeException;
//import java.util.List;
//import java.util.Map;
//import java.util.*;
//
///**
// * Practice of encapsulation - Netflix-content recommendation system
// */
//
//public class UserProfile {
//    private String userId;
//    private List<Genre> preferredGenre;
//    private Map<String, Double> viewingHistory;
//    private RecommendationScore currentScore;
//
//    //dependency injected via constructor or setter
//    private RecommendationEngine recommendationEngine;
//
//    public UserProfile(String userId, List<Genre> preferredGenre, RecommendationEngine recommendationEngine){
//        this.userId = userId;
//        this.preferredGenre = preferredGenre;
//        this.viewingHistory = new HashMap<>();
//        this.currentScore = new RecommendationScore();
//        this.recommendationEngine = recommendationEngine;
//    }
//
//
//
//    // private - internal calculation logic is hidden
//    private double calculateGenreAffinity(Genre genre) {
//        // complex algorithm hidden from external classes
//        return viewingHistory.entrySet().stream().filter(entry -> getGenre(entry.getKey()) == genre)
//                .mapToDouble(entry -> entry.getValue())
//                .average()
//                .orElse(0.0);
//
//    }
//
//    // controlled access public interface
//    public List<Content> getRecommendations(int count){
//        //use private methods internally
//        List<Genre> topGenres = getTopPreferredGenres();
//        return recommendationEngine.generateRecommnedations(userId, topGenres, count);
//    }
//
//    // controlled modification with validation
//    public void recordViewing(String contentId, double rating) {
//        if(rating >= 1.0 && rating <= 5.0){
//            viewingHistory.put(contentId, rating);
//            updateRecommendationScore();
//        }
//    }
//}
