package cvik8.Uloha85;

import java.util.Iterator;

public class BodIterator implements Iterator<Bod> {
    private int currentIndex = 0;
    Bod[] body;

    public BodIterator(Bod[] body) {
        this.body = body;
    }

    @Override
    public boolean hasNext() {
        System.out.println("hasnext");
        return currentIndex < body.length && body[currentIndex] != null;
    }

    @Override
    public Bod next() {
        System.out.println("next");
        return body[currentIndex++];
    }
}
