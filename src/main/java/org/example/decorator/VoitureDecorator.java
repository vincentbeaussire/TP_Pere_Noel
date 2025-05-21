package org.example.decorator;

public class VoitureDecorator extends JouetDecorator {
    public VoitureDecorator(Jouet jouet) {
        super(jouet);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", voiture";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.00;
    }

    @Override
    public void drive() {

    }
}
