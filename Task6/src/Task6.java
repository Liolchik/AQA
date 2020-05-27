public class Task6 {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJK";
        String onlyConsonanats = str.replaceAll("[AEI]","");
        System.out.println (onlyConsonanats.toLowerCase());
    }
}