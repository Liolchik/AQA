public class Check {

    void number(int number) {

        if (number < 0) {
            System.out.println("Number < 0");
        } else if (number > 0) {
            System.out.println("Number > 0");
        }

        if (number == 0) {
            throw new ArithmeticException("Insert any number other than 0");
        }
    }

    public static void main(String[] args) {
        Check numbers = new Check();
        numbers.number(0);
    }
}
