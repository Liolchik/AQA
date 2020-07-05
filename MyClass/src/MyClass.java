public class MyClass {

    static int a;
    int b = 1000;
    int value = 100;

    static void change(int value) {
        a = value;
        System.out.println(a / 2);
    }

    void anotherChange(int value) {
        this.b = value;
        System.out.println(b * 2);
    }
    public static void main(String[] args) {
        change(3);
        MyClass justanother = new MyClass();
        justanother.anotherChange(8);
    }
}
