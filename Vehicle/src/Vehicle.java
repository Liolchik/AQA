public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
    }

    public void move(int velocity, int direction) {
        currentVelocity = velocity;
        currentDirection = direction;

    }

    public void stop() {
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public class Car extends Vehicle {
        int numberOfSeats = 2;

        public Car(String name, String size) {
            super(name, size);
        }

        protected int numberOfSeats() {
            return numberOfSeats;
        }

        @Override
        public void stop() {
            super.stop();
        }
    }

    public class Coupe extends Car {

        public Tesla(String name, String size) {
            super(name, size);
        }

        public static void main(String args[]) {

            Coupe myCoupeMini = new Coupe("Some", "Mini");

            myCoupeMini.move(300, 55);
            myCoupeMini.steer(96);
            myCoupeMini.stop();
        }
    }
}

