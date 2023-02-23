import projekt.*;
import projekt.clenovia.Manazer;
import projekt.clenovia.Programator;
import projekt.clenovia.Tester;

public class Program {

    public static void main(String[] args) {
        ClenTimu manager = new Manazer("clen1");
        ClenTimu prog1 = new Programator("prog1");
        ClenTimu prog2 = new Programator("prog2");
        ClenTimu tester1 = new Tester("tester1");
        ClenTimu tester2 = new Tester("tester2");

        ProjektovyTim team = new ProjektovyTim("team1");
        team.pridajClena(manager);
        team.pridajClena(prog1);
        team.pridajClena(prog2);
        team.pridajClena(tester1);
        team.pridajClena(tester2);

        for (int i = 0; i < team.getClenovia().length; i++) {
            System.out.println(team.getClenovia()[i].toString());
        }

        team.programuj("mmeno");

    }

}
