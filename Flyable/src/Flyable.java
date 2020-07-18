public interface Flyable {

    public void fly();

    public class Duck implements Flyable {

        public void swim() {
            System.out.println("Duck is flying!");
        }

    }
    public class Bird implements Flyable {

        public void swim() {
            System.out.println("Bird is flying!");
        }

        public static void main(String[] args) {

            Duck duck = new Duck();
            duck.swim();
        }
    }
}