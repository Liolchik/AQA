import java.util.concurrent.SynchronousQueue;

public class Beersong {
    public static void main(String[] args) {


        int beerNum = 99;
        String word = " бутылок (бутылки)";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " бутылка";
            }
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива");
            System.out.print(" возьми одну");
            System.out.println(" пусти по кругу");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                //System.out.println(beerNum + " " + word + " пива на стене");
            }
            else {
                System.out.println("нет бутылок пива на стене");
            }
        }
    }
}