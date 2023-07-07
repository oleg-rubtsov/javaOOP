package tracker;

public class Training {
    public int a;
    public int b;
    public Training(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static void myMethod() {
        System.out.println("Hello World!");
    }

    public String get_distance() {
        return ("Values^=:" + this.a + "/" + this.b);
    }
//
//    public static void main(String[] args) {
//        // myMethod();
//    }
}
