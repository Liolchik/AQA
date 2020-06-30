public class Ship {
    private Ship(){
        public static Ship makeShip(){
            return new Ship();
        }
        public void makeSound(){
            System.out.println("Horn! Horn!");
        }
    }
}
/* protected access works directly with inheritance and allows to access sub class outside the same package*/