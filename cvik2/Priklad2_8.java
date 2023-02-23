public class Priklad2_8 {
    public static void main(String[] args) {
        String[] dni = { "pondelok", "utorok", "streda", "stvrtok", "piatok", "sobota", "nedela" };
        String result = "";
        for (int i = 0; i < dni.length; i++) {
            result += dni[i];
            if (i < dni.length - 1) {
                result += ',';
            }
        }

        System.out.println(result);
    }
}
