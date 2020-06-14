public class Overloading {

    void ovlDemo() {
        System.out.println("Without parameters");
    }

    void ovlDemo(int a) {
        System.out.println("One parameter" + a);
    }

    void ovlDemo(int a, int b) {
        System.out.println("Two parameters" + a + b);
        return a + b;
    }

    void ovlDemo(double a, double b) {
        System.out.println("Double parameters" + a + b);
        return a + b
    }
}