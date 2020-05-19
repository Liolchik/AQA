public class Figures {
    public static void main(String[] args) {

        char asterisk = '*';
        char space = ' ';

        int rowsCount = 8;
        for(int i = 0; i < rowsCount; i++) {

            int countAst = 8;
            for(int j = 0; j < countAst; j++) {
                System.out.print(asterisk);
            }

            System.out.println();
        }


    }
}
