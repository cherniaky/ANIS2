package cvik8;

public class SuborFacade {
    private TxtSubor txtSubor;
    private CsvSubor csvSubor;
    private ExcelSubor excelSubor;

    public SuborFacade() {
        this.txtSubor = new TxtSuborImpl();
        this.csvSubor = new CsvSuborImpl();
        this.excelSubor = new ExcelSuborImpl();
    }

    public void zapis(String subor, String data, String format) {
        if (format.equals("txt")) {
            txtSubor.zapis(subor, data);
        } else if (format.equals("csv")) {
            csvSubor.zapis(subor, data);
        } else if (format.equals("excel")) {
            excelSubor.zapis(subor, data);
        } else {
            throw new UnsupportedOperationException("Unsupported format: " + format);
        }
    }

    public String citaj(String subor, String format) {
        if (format.equals("txt")) {
            return txtSubor.citaj(subor);
        } else if (format.equals("csv")) {
            return csvSubor.citaj(subor);
        } else if (format.equals("excel")) {
            return excelSubor.citaj(subor);
        } else {
            throw new UnsupportedOperationException("Unsupported format: " + format);
        }
    }
}
