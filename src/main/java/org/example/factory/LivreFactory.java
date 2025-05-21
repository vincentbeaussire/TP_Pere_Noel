package org.example.factory;

public class LivreFactory extends JouetFactory{
    @Override
    public JouetF createJouet() {
        return new Livre();
    }
}
