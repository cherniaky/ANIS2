package projekt;

abstract public class ClenTimu {
    protected String meno;
    protected ProjektovyTim tim;

    public ClenTimu(String meno) {
        this(meno, null);
    }

    public ClenTimu(String meno, ProjektovyTim tim) {
        this.meno = meno;
        this.tim = tim;
    }

    public String toString() {
        if (tim != null) {
            return meno + " : " + tim.nazov;
        }
        return meno;
    }

    public abstract void spracujUlohu(String uloha);
}
