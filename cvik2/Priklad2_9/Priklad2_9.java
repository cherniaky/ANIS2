package cvik2.Priklad2_9;

public class Priklad2_9 {
    public static void main(String[] args) {
        Izba izba1 = new Izba(2, 2, true, "first");
        Izba izba2 = new Izba(2, 2, true, "second");
        Izba izba3 = new Izba(2, 2, true, "third");

        Izba[] izby = { izba1, izba2, izba3 };
        Dom dom = new Dom(izby, "Dom");

    }
}
