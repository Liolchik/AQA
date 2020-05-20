public class Triangle {
    public static void main(String[] args) {

        String asteRisk = "*";
        String space = " ";
        int countRows = 7;

        for (int i = 0; i <= countRows; i++) {
            System.out.print(asteRisk);
            asteRisk += "*";
            System.out.println();
        }
    }
}
