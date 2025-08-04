package ObjectOrientedProgramming.Encapsulation;

import java.time.Duration;
import java.time.LocalDateTime;

//public class Ride {
//    private String userId;
//    private Location startLocation;
//    private Location endLocation;
//    private RideStatus status;
//    private Driver assignedDriver;
//    private FareCalcuator fareCalcuator;
//    private LocalDateTime startTime;
//
//    //business logic
//    private double calculateBaseFare() {
//        double distance = LocationUtils.calculateDistance(startLocation, endLocation);
//        double duration = estimatedDuration();
//        return fareCalcuator.calculate(distance, duration, getCurrenetDemandMultiplier());
//    }
//
//    private boolean canCancelRide() {
//        return status == RideStatus.REQUESTED || (status == RideStatus.ACCEPTED && Duration.between(startTime, LocalDateTime.now()).toMinutes() < 5);
//    }
//
//    //public interface
//    public RideEstimated getEstimate() {
//        double fare = calculateBaseFare();
//        int estimatedArrival = calculateETA();
//        return new RideEstimate(fare, estimatedArrival);
//    }
//
//    public boolean cancelRide(String reason){
//        if(canCancelRide()) {
//            status = RideStatus.CANCELLED;
//            notifyDriver();
//            processCancellationFee();
//            return true;
//        }
//        return false;
//    }
//
//    //controlled state
//    public void updateRideStatus(RideStatus, newStatus){
//        if(isValidStatusTransition(status, newStatus)){
//            status = newStatus;
//            notifyStakeholders();
//            logStatusChange();
//        }
//    }
//
//}
