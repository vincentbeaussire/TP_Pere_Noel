package org.example.decorator;

public abstract class JouetDecorator implements Jouet {

    protected Jouet jouet;

    public JouetDecorator(Jouet jouet) {
        this.jouet = jouet;
    }

    @Override
    public String getDescription() {
        return jouet.getDescription();
    }

    @Override
    public double getCost() {
        return jouet.getCost();
    }
}
