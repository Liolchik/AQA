class SimpleClass {
    int num;
    boolean bool;
    String str;

    public Simple(String str) {
        this.str = str;
        System.out.println("String");
    }

    public Simple(String str, int num) {
        this(str);
        this.num = num;
        System.out.println("String and Number");
    }

    public Simple(String str, int num, boolean bool) {
        this(str, num);
        this.bool = bool;
        System.out.println("String and Number and Boolean");
    }
}
