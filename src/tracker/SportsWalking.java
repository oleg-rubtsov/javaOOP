package tracker;

public class SportsWalking extends Training {
    public double height;
    public double SOMETHING_FIRST_ARGUMENT = 0.035;
    public double SOMETHING_SECOND_ARGUMENT = 0.035;
    public SportsWalking (int action, int duration, int weight, int height){
        super(action, duration, weight);
        this.height = height;
        this.training_type = "WLK";
    }
    public double get_spent_calories() {
        return (
                (SOMETHING_FIRST_ARGUMENT * weight + (Math.pow(get_mean_speed() * M_IN_KM, 2) / height)
                * SOMETHING_SECOND_ARGUMENT * weight) * duration * MINUTES_IN_HOUR
        );
    }
}
