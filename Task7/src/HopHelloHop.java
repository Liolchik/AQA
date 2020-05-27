public class HopHelloHop {
    public static void main(String[] fields){

    String a = "hop";
    String b = "hello";

    StringBuffer sb = new StringBuffer();

    String result = "";

    if (a.length() < b.length()){
        result = sb.append(a).append(b).append(a).toString();
        
    }
    System.out.println(result);
}
}