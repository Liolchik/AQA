package com.pack1;

public class B extends A {

    protected String name = "Olga";

    B(String name) {
        super(name);
    }

    @Override
    public void changeToUpperCase(){
        super.changeToUpperCase();
        System.out.println(name);
    }

    @Override
    public void changeToLowerCase () {
        System.out.println("Matsak");
    }
}
