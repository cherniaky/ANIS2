package cvik8.Uloha85;

import java.util.Iterator;

public class GrafickyObjekt implements Iterable<Bod> {

    private Bod[] body;

    public GrafickyObjekt(Bod[] body) {
        this.body = body;
    }

    @Override
    public Iterator<Bod> iterator() {
        return new BodIterator();
    }

    private class BodIterator implements Iterator<Bod> {

        private int currentIndex = 0;

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
}