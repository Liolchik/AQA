public class NullPointerException {

    public static void main(String[] args) {
        try {
            iCanThrowException();
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception was caught");
        }
    }

    public static void iCanThrowException() {
        throw new NullPointerException();
    }
}
