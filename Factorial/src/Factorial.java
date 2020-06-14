public class Factorial {

    public static void main(String[] args) {

        long factorial = 1;

        int a = 4;

        for (long i = 1; i <= a; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}