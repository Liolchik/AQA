public class SecondFigure {
    public static void main(String[] args) {

        char asterisk = '*';
        char space = ' ';
        int countRows = 8; 
        int countAsterisks = 5;

        for (int i = 1; i <= countAsterisks; i++) {
            for (int j = 1; j <= countRows; j++) {
                if (i == 1 || i == countAsterisks) {
                    System.out.print(asterisk);
                } else {
                    if ((i > 1 && i < countAsterisks) && (j > 1 && j < countRows)) {
                        System.out.print(space);
                    } else {
                        System.out.print(asterisk);
                    }
                }
            }
            System.out.println();
        }
    }
}