package cvik7;

public class Obrazovka {
    private static Obrazovka instance;

    private Obrazovka() {
    }

    public static Obrazovka getInstance() {
        if (instance == null) {
            instance = new Obrazovka();
        }
        return instance;
    }
}
