package cvik2;

public class Priklad2_4 {
    public static void main(String[] args) {
        int[] numbers = { 25, 24, 26, 45, 25, 23, 50, 51 };
        int count = 0;
        int i = 0;

        while (i < numbers.length) {
            if (numbers[i] >= 25 && numbers[i] <= 50) {
                count++;
            }
            i++;
        }

        System.out.println(
                "The number of numbers using a while loop : "
                        + count);

        count = 0;
        i = 0;

        do {
            if (numbers[i] >= 25 && numbers[i] <= 50) {
                count++;
            }
            i++;
        } while (i < numbers.length);

        System.out.println(
                "The number of numbers using a do-while loop: "
                        + count);
    }
}
