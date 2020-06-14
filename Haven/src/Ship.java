public class Ship {
    String name;
    private int displacement;
    private Engine engine;
    public Shipmen[] crew;

    Ship(String name, int displacement, Shipmen[] crew) {

        this.name = name;
        this.displacement = displacement;
        this.crew = crew;

        if (displacement > 0 && displacement < 100) {
            this.engine =  new Engine(1);
        }
        else if (displacement > 100) {
            this.engine = new Engine(2);
        }
    }

    void info(){
        System.out.println(this.name + " displacement " + this.displacement);
        this.engine.info();
        for (Shipmen sp : this.crew) {
            sp.info();
        }
    }
}