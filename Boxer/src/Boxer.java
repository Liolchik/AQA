class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    static Boxer ourBoxer = new Boxer (30, 101, 100);

    public static boolean fight(Boxer anotherBoxer) {
        boolean result;
        if ( (ourBoxer.age > anotherBoxer.age && ourBoxer.weight > anotherBoxer.weight && ourBoxer.strength >= anotherBoxer.strength)) {
            result = true;
            return result;
        }
        else {
            result = false;
            return result;
        }
    }
}
