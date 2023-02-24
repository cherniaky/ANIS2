package cvik7;

public class MaleData implements Data {
    private byte[] data;

    public MaleData() {
        this.data = new byte[10];
    }

    public byte[] data() {
        return data;
    }
}
