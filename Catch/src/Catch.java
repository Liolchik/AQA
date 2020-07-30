import java.util.*;

public class Catch {

    public static void main(String[] args) {
        readData();
    }
    public static void readData() {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Please,input any number");
                myList.add(s.nextInt());
            }
        }
        catch (InputMismatchException e) {
            System.out.println(myList);
        }
    }
}
