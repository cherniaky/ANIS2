package cvik8.Uloha84;

public class GrafickeOknoInvoker {
    private Command presunCommand;
    private Command minimalizujCommand;
    private Command zavriCommand;

    public GrafickeOknoInvoker(Command presunCommand, Command minimalizujCommand, Command zavriCommand) {
        this.presunCommand = presunCommand;
        this.minimalizujCommand = minimalizujCommand;
        this.zavriCommand = zavriCommand;
    }

    public void presunOkno(int x, int y) {
        presunCommand.execute();
    }

    public void minimalizujOkno() {
        minimalizujCommand.execute();
    }

    public void zavriOkno() {
        zavriCommand.execute();
    }
}