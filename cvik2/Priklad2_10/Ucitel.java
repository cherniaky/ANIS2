package cvik2.Priklad2_10;

public class Ucitel {
    Student[] studenti = {};
    String meno;

    public Ucitel(String meno) {

        this.meno = meno;
    }

    public void addStudents(Student[] studenti) {

        this.studenti = studenti;

    }
}
