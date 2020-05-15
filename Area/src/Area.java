public class Area {

    public static void main(String[] args) {

        int radius = 8;
        int a = 3;
        int b = 4;

        var areaCircle = Math.round(Math.PI * Math.pow(radius, 2));
System.out.println("The area of a circle with the radius " + radius + " is equal to  " + areaCircle);

        var areaRectangle = a * b;
        System.out.println("The area of a rectangle is equal to  " + areaRectangle);
    }
}
