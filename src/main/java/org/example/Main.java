package org.example;

import org.example.decorator.Jouet;
import org.example.decorator.PlainJouet;
import org.example.decorator.VoitureDecorator;
import org.example.factory.JouetF;
import org.example.factory.Voiture;
import org.example.factory.VoitureFactory;
import org.example.observer.MyObserver;
import org.example.observer.Observer;
import org.example.observer.Subject;

public class Main {
    public static void main(String[] args) {
        // Création d'un jouet
        Jouet baseJouet = new PlainJouet();
        System.out.println(baseJouet.getDescription() + " " + baseJouet.getCost());

        // Ajout d'une voiture
        Jouet voiture1 = new VoitureDecorator(baseJouet);
        System.out.println(voiture1.getDescription() + " " + voiture1.getCost());

        //Comportement de mon jouet
        VoitureFactory voitureFactory = new VoitureFactory();
        JouetF voiture = voitureFactory.createJouet();
        voiture.drive();

        // Notifier les lutins
        Subject subject = new Subject();
        Observer observer1 = new MyObserver("Lutin Toto");
        subject.addObserver(observer1);
        subject.notifyObserver("la première étape de la production a eu lieu.");

    }
}