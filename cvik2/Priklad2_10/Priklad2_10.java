package cvik2.Priklad2_10;

public class Priklad2_10 {
    public static void main(String[] args) {
        Student[] students = { new Student("J"), new Student("d"), new Student("r") };

        Ucitel ucitel = new Ucitel("Ucitel");

        students[0].setUcitel(ucitel);
        students[1].setUcitel(ucitel);
        students[2].setUcitel(ucitel);

        ucitel.addStudents(students);
    }
}
