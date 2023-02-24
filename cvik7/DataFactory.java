package cvik7;

public class DataFactory {
    public static Data createData(int size) {
        if (size <= 100) {
            return new MaleData();
        } else {
            return new VelkeData();
        }
    }
}
