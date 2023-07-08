package tracker;

public class Running extends Training {
    public int CALORIES_MEAN_SPEED_MULTIPLIER = 18;
    public double CALORIES_MEAN_SPEED_SHIFT = 1.79;
    public Running (int action, int duration, int weight){
        super(action, duration, weight);
        training_type = "RUN";
    }
    public double get_spent_calories() {
        return (
                (CALORIES_MEAN_SPEED_MULTIPLIER * get_mean_speed()
                + CALORIES_MEAN_SPEED_SHIFT) * weight / M_IN_KM * duration * MINUTES_IN_HOUR
        );
    }
}
