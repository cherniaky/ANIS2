package cvik7;

public class VelkeData implements Data {
    private byte[] data;

    public VelkeData() {
        this.data = new byte[1000];
    }

    public byte[] data() {
        return data;
    }
}
