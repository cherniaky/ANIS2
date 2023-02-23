package cvik5.projekt;

import java.util.Objects;

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

    public boolean equals(Object obj) {
        if (obj instanceof ClenTimu) {
            ClenTimu other = (ClenTimu) obj;
            return this.meno.equals(other.meno);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(meno);
    }

    public abstract void spracujUlohu(String uloha);
}
