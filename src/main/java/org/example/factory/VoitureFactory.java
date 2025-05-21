package org.example.factory;

public class VoitureFactory extends JouetFactory {
    @Override
    public JouetF createJouet() {
        return new Voiture();
    }
}
