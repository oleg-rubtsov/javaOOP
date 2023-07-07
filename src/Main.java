import tracker.Training;
import tracker.Running;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        // HashMap String, Map<>

        Main obj = new Main();
        obj.start();
    }
    private static void start() {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Running obj = new Running(15000, 1.0, 75.0);
        System.out.println(obj.get_spent_calories());
    }
}