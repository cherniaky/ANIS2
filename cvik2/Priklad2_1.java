package cvik2;
public class Priklad2_1 {
    public static void main(String[] args) {
        int plat = 2500;

        if (plat < 1000) {
            System.out.println("Plat belongs to the interval < 1000");
        } else if (plat >= 1000 && plat <= 3000) {
            System.out.println("Plat belongs to the interval 1000-3000");
        } else {
            System.out.println("Plat belongs to the interval > 3000");
        }
    }
}