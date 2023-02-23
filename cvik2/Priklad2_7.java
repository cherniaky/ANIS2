public class Priklad2_7 {
    public static void main(String[] args) {

        String s = "dad";
        Boolean isPalindrom = true;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrom = false;
            }
        }

        System.out.println(isPalindrom);

    }

}
