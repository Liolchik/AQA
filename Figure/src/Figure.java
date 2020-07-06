abstract public class Figure {

    protected double width;
    protected double height;

    abstract double calculateArea (int width, int height);
}

public class Rectangle extends Figure {
    @Override
    double calculateArea(int width, int height) {
        return width*height;
    }
}
public class Main {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle area equals "  + rectangle.calculateArea(7,13));
    }
}