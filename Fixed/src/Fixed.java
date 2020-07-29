public class Fixed {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException c) {
            c.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
