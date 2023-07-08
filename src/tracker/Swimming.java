package tracker;

public class Swimming extends Training {
    public int length_pool;
    public int count_pool;
    public double SOMETHING_FIRST_ARGUMENT = 1.1;
    public double SOMETHING_SECOND_ARGUMENT = 2;
    public Swimming (int action, int duration, int weight, int length_pool, int count_pool){
        super(action, duration, weight);
        this.length_pool = length_pool;
        this.count_pool = count_pool;
        this.LEN_STEP = 1.38;
        this.training_type = "SWM";
    }
    public Double get_mean_speed() {
        return (double) (length_pool * count_pool / M_IN_KM / duration);
    }
    public double get_spent_calories() {
        return ((get_mean_speed() + SOMETHING_FIRST_ARGUMENT) * SOMETHING_SECOND_ARGUMENT * weight * duration );
    }
}
