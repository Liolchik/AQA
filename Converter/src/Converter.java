public interface Converter {
    double convert(double celsius);
}
public class KelvinConverter implements Converter {

    public double kelvin = 273.15;

    @Override
    public double convert(double celsius) {
        return kelvin + celsius;

    }

    public class FahrenheitConverter implements Converter {

        @Override
        public double convert(double celsius) {
            double fahrenheit = ((celsius * 9) / 5) + 32;
            return fahrenheit;
        }
    }
}
    public class Main {
    public static void main(String args[]) {

        FahrenheitConverter fahrenheit = new FahrenheitConverter();
        KelvinConverter kelvin = new KelvinConverter();
    }
}