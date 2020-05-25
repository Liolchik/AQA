public class StartsWith {
    public static void main(String[] fields) {


        String word1 = "The End";
        System.out.println("String word1 starts with The: " + word1.startsWith("The"));

        String word2 = "End The";
        System.out.println("String word2 starts with The: " + word2.startsWith("The"));
    }
}