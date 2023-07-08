package tracker;

abstract public class Training {
    public int action;
    public int duration;
    public int weight;
    public double LEN_STEP = 0.65;
    public String training_type;
    public int M_IN_KM = 1000;
    public int MINUTES_IN_HOUR = 60;
    public Training(int action, int duration, int weight) {
        this.action = action;
        this.duration = duration;
        this.weight = weight;
    }
    private Double get_distance() {
        return action * LEN_STEP / M_IN_KM;
    }
    public Double get_mean_speed() {
        return get_distance() / duration;
    }
    abstract double get_spent_calories();
    public InfoMessage show_training_info() {
        return new InfoMessage(
                training_type,
                duration,
                get_distance(),
                get_mean_speed(),
                get_spent_calories()
        );
    }
}
