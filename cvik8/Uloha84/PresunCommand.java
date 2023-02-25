package cvik8.Uloha84;

public class PresunCommand implements Command {
    private GrafickeOkno okno;
    private int x;
    private int y;

    public PresunCommand(GrafickeOkno okno, int x, int y) {
        this.okno = okno;
        this.x = x;
        this.y = y;
    }

    public void execute() {
        okno.presunt(x, y);
    }
}