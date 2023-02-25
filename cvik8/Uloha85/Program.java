package cvik8.Uloha85;

public class Program {
    public static void main(String[] args) {
        Bod[] body = { new Bod(), new Bod(), new Bod() };
        GrafickyObjekt objekt = new GrafickyObjekt(body);

        for (Bod bod : objekt) {
            System.out.println(bod.x + ", " + bod.y);
        }
    }
}