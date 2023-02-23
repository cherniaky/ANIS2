public class Priklad2_2 {
    public static void main(String[] args) {
        int[] cisla = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int i = 0; i < cisla.length; i++) {
            sum += cisla[i];
        }

        double average = (double) sum / cisla.length;
        System.out.println("The average value of the numbers: " + average);
    }
}
