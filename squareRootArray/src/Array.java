public class Array {

    public static void main(String[] args) {

        int myArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = 0 + (int) (Math.random() * 100);
            myArray[i] = (int) Math.sqrt(myArray[i]);

            System.out.println(myArray[i]);

        }
    }
}
