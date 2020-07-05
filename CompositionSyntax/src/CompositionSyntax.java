public class CompositionSyntax {
        String someString;

    CompositionSyntax() {
        System.out.println("Composition Syntax");
        someString = "Some String";
    }

    @Override
    public String toString() {
        return someString;
    }
}
class CompositionLetsSee {

    private String someString1, someString2;
    private CompositionSyntax someObject = new CompositionSyntax();
    private int intToString;
    private double doubleToString;

    @Override
    public String toString() {
        return "string 1 = " + someString1 +
                " string 2 = " + someString2 +
                " string from another class = " + someObject +
                " i = " + intToString +
                " d = " + doubleToString;
    }

    CompositionLetsSee cls = new CompositionLetsSee();

    System.out.print (cls);
}