package org.example.observer;

public class MyObserver implements Observer {

    private String name;

    public MyObserver(String name) {
        this.name = name;
    }

    @Override
    public void onNotify(String message) {
        System.out.println(name + " a reçu le message suivant : " + message);
    }
}
