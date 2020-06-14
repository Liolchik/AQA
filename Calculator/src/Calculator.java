public class Calculator {

    double firstValue;
    double secondValue;
    String operation;

    public Calculator(double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation = operation;
    }

    public void calculate() {

        if (operation.equals("-")) {
            double deduction = firstValue - secondValue;
            System.out.println(deduction);
        } else (operation.equals("+")) {
            double sum = firstValue + secondValue;
            System.out.println(sum);


            public static void main (String[]args){
                Calculator calc = new Calculator(100, 99, "-");
                calc.calculate();
            }
        }
    }
}