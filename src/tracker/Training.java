package tracker;
import java.util.HashMap;
import java.util.Map;

public class Training {
    public int action;
    public double duration;
    public double weight;
    public double LEN_STEP = 0.65;

    public int M_IN_KM = 1000;
    public Training(int action, double duration, double weight) {
        this.action = action;
        this.duration = duration;
        this.weight = weight;
    }
    public Double get_distance() {
        return this.action * this.LEN_STEP / this.M_IN_KM;
    }
    public Double get_mean_speed() {
        double distance = this.get_distance();
        return distance / this.duration;
    }
    public void get_spent_calories(String key, Integer time) {
    }
    public void show_training_info(String key, Integer time) {
    }
}
