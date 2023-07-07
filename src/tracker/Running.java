package tracker;

public class Running extends Training {
    public int CALORIES_MEAN_SPEED_MULTIPLIER = 18;
    public double CALORIES_MEAN_SPEED_SHIFT = 1.79;
    public Running (int action, double duration, double weight){
        super(action, duration, weight);
    }
    public double get_spent_calories() {
        return (CALORIES_MEAN_SPEED_MULTIPLIER * this.get_mean_speed() + CALORIES_MEAN_SPEED_SHIFT) * this.weight / M_IN_KM * this.duration;
    }
}
