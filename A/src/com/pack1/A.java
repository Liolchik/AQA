package com.pack1;

public class A {

    protected String name;
    protected String surname;


    A (String name) {
        this.name = name;
    }

    public void changeToUpperCase() {
        name = name.toUpperCase();
        System.out.println("My name is " + name);

    }

    public void changeToLowerCase () {
        surname = surname.toLowerCase ();
        System.out.println("My second name is " + surname);
    }
}
