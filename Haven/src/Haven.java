
public class Haven {
    public static void main(String[] args) {

        Shipmen captain = new Shipmen ("captain");
        Shipmen cook = new Shipmen ("cook");
        Shipmen[] shipcrew = {captain, cook};

        Ship myShip = new Ship("Victory", 150, shipcrew);

        myShip.info();
    }
}