package cvik8.Uloha84;

public class MinimalizujCommand implements Command {
    private GrafickeOkno okno;

    public MinimalizujCommand(GrafickeOkno okno) {
        this.okno = okno;
    }

    public void execute() {
        okno.minimalizuj();
    }
}