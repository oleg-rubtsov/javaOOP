package tracker;

public class Swimming extends Training {
    public int length_pool;
    public int count_pool;
    public Swimming (int action, double duration, double weight, int length_pool, int count_pool){
        super(action, duration, weight);
        this.length_pool = length_pool;
        this.count_pool = count_pool;
        this.LEN_STEP = 1.38;
    }
    public Double get_mean_speed() {
        double distance = this.get_distance();
        return this.length_pool * this.count_pool / this.M_IN_KM / this.duration;
    }
    public double get_spent_calories() {
        return ((this.get_mean_speed() + 1.1) * 2 * this.weight * this.duration );
    }
}
