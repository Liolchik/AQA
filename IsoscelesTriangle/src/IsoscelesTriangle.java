public class IsoscelesTriangle {
    public static void main(String[] args) {

        String asterisk = "*";
        String space = " ";
        int rows = 5;
        int decrease = rows;


        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < decrease; j++) {
                System.out.print(space);
            }

            decrease--;

            System.out.print(asterisk);

            asterisk += "**";

            System.out.println();
        }
    }
}
