package tracker;

public class InfoMessage {
    public String training_type;
    public Integer duration;
    public Double distance;
    public Double speed;
    public Double calories;

    public InfoMessage(String training_type, Integer duration, Double distance, Double speed, Double calories) {
        this.training_type = training_type;
        this.duration = duration;
        this.distance = distance;
        this.speed = speed;
        this.calories = calories;

    }
    public String get_message() {
        return (
                "Тип тренировки: " + training_type
                + "; Длительность: " + duration + " ч.; Дистанция: "
                + distance + " км; Ср. скорость: " + speed
                + " км/ч; Потрачено ккал: " + calories + "."
        );
    }
}