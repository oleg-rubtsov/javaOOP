package tracker;

public class SportsWalking extends Training {
    public double height;
    public SportsWalking (int action, double duration, double weight, double height){
        super(action, duration, weight);
        this.height = height;
    }
    public double get_spent_calories() {
        return ((0.035 * this.weight + (Math.pow(this.get_mean_speed(), 2) / this.height)
                * 0.029 * this.weight) * this.duration);
    }
}
