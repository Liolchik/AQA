public class StaticNonStatic {

    private static int nextId = 3;
    private int id;

    public StaticNonStatic() {
        this.id = nextId;
        nextId ++;
    }

    public int getId() {
        return this.id;
    }

    StaticNonStatic  cls = new StaticNonStatic();
     cls.getId();

    StaticNonStatic cls = new StaticNonStatic();
     cls.getId();
}