public class Priklad2_5 {

    public static void main(String[] args) {
        int[] main = { 24, 26, 25, 45, 25, 23, 50, 51 };
        int hodnota = 25;
        int index = -1;

        // Loop through the array and find the index of the first occurrence of the
        // value
        for (int i = 0; i < main.length; i++) {
            if (main[i] == hodnota) {
                index = i;
                break;
            }
        }

        System.out.println(
                "The index of the first occurrence of the value " + hodnota + " in the array : " + index);
    }

}
