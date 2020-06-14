public class Initialization {
    public static void main(String[] args) {
        private static int nextId;
        private int id;
        private String name;
        private double phoneNumber;
    }

System.out.println("In");
        id = nextId;
        nextId ++;


public Initialization (String name, double phoneNumber) {
        System.out.println("In");
        this.name = name;
        this.phoneNumber = phoneNumber;
        }

public Initialization() {
        System.out.println("Inside empty constructor");
        this.name = "";
        this.phoneNumber = 0.0;
        }

public int getId() {
        return this.id;
        }
}
