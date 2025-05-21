package org.example.factory;

public class Livre implements JouetF{
    @Override
    public void drive() {

    }

    @Override
    public void read() {
        System.out.println("Je suis un livre");
    }
}
