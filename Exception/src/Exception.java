public class Exception {

    public static void main(String[] args) {

        try {
            int a = args.length;
            System.out.println(a);
            int b = 10 / a;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
            try {
                int[] c = {1};
                System.out.println(c[1]);
            } catch (ArrayIndexOutOfBoundsException c) {
                System.out.println(" Index Out Of Bounds");
            }
        }
    }
}
