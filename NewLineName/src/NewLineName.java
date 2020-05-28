public class NewLineName {
    public static void main(String[] args) {

        String names = "Den, John, Will, Kate, Adam, Robin";
        String[] result;
        result = names.split(", ");
        
        for (String i : result){
            System.out.println(i);
        }
    }
}
