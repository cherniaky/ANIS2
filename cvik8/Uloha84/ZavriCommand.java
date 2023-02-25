package cvik8.Uloha84;

public class ZavriCommand implements Command {
    private GrafickeOkno okno;

    public ZavriCommand(GrafickeOkno okno) {
        this.okno = okno;
    }

    public void execute() {
        okno.zavri();
    }
}