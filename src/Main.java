import tracker.Training;
import tracker.Running;
import tracker.Swimming;
import tracker.SportsWalking;
import tracker.InfoMessage;
import java.util.Map;
import static java.util.Map.entry;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer[]> packages = Map.ofEntries(
                entry("SWM", new Integer[]{720, 1, 80, 25, 40}),
                entry("RUN", new Integer[]{1500, 1, 75}),
                entry("WLK", new Integer[]{9000, 1, 75, 180})
        );
        for(String key: packages.keySet()){
            Training training = read_package(key, packages.get(key));
            if (training != null) {
                start(training);
            }
        }
    }
    private static void start(Training training) {
        InfoMessage info = training.show_training_info();
        System.out.println(info.get_message());
    }
    private static Training read_package(String trainingType, Integer[] values) {
        return switch (trainingType) {
            case ("SWM") -> new Swimming(values[0], values[1], values[2], values[3], values[4]);
            case ("RUN") -> new Running(values[0], values[1], values[2]);
            case ("WLK") -> new SportsWalking(values[0], values[1], values[2], values[3]);
            default -> null;
        };
    }
}