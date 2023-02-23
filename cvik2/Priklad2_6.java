
public class Priklad2_6 {
    public static void main(String[] args) {
        int[][] matica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        
        for (int i = 0; i < matica.length; i++) {
            double sum = 0;
            for (int j = 0; j < matica[i].length; j++) {
                sum += matica[i][j];
            }
            double avg = sum / matica[i].length;
            System.out.println("The average value of row " + (i+1) + " is: " + avg);
        }
        
        for (int j = 0; j < matica[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < matica.length; i++) {
                sum += matica[i][j];
            }
            double avg = sum / matica.length;
            System.out.println("The average value of column " + (j+1) + " is: " + avg);
        }
    }
}
