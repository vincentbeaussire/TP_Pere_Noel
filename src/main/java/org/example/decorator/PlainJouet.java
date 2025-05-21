package org.example.decorator;

public class PlainJouet implements Jouet {
    @Override
    public String getDescription() {
        return "Jouet basique";
    }

    @Override
    public double getCost() {
        return 5.00;
    }

    @Override
    public void drive() {

    }
}
