package tracker;
import java.util.HashMap;
import java.util.Map;

public class InfoMessage {
    public String training_type;
    public Integer duration;
    public Integer distance;
    public Double speed;
    public Double calories;

    public int b;
    public InfoMessage(String training_type, Integer duration, Integer distance, Double speed, Double calories) {
        this.training_type = training_type;
        this.duration = duration;
        this.distance = distance;
        this.speed = speed;
        this.calories = calories;

    }
    public static void show_training_info(String[] args) {
        InfoMessage obj = new InfoMessage("tmp", 2, 2, 3.0, 4.0);
    }
    public String get_message(String key) {
        return (
                "Тип тренировки: " + this.training_type
                + "; Длительность: " + this.duration + " ч.; Дистанция: "
                + this.distance + " км; Ср. скорость: " + this.speed
                + " км/ч; Потрачено ккал: " + this.calories + "."
        );
    }
}