public class Sum {

    public static void main(String[] args) {

        int myArray[] = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            myArray[i] = 0 + (int) (Math.random() * 100);
            if (i > 0 && i < 10){
                sum += i;
            }

        }

        System.out.println(sum);
    }
}
