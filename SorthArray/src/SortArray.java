public class SortArray {
    public static void main(String[] args) {

        int myArray[] = new int[10];

        for (int i = 0; i < 10; i++) {
            myArray[i] = 0 + (int) (Math.random() * 100);
        }
        for (int i = 0; i < myArray.length; i++) {

            int min = myArray[i];
            int min_i = i;

            for (int j = i + 1; j < myArray.length; j++) {

                if (myArray[j] < min) {
                    min = myArray[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = myArray[i];
                myArray[i] = myArray[min_i];
                myArray[min_i] = tmp;
                System.out.println(myArray[i]);
            }
        }
    }
}
