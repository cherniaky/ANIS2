package cvik2;

public class Priklad2_3 {
    public static void main(String[] args) {
        int[] numbers = { 25, 24, 26, 45, 25, 23, 50, 51 };
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= 25 && numbers[i] <= 50) {
                count++;
            }
        }

        System.out.println(
                "The number of numbers with values in the range 25 to 50: "
                        + count);
    }
}
