package cvik7;

import java.util.HashMap;
import java.util.Map;

public class Kalendar {
    private Map<Integer, Mesiac> months;

    public Kalendar() {
        months = new HashMap<>();
    }

    public Mesiac getMonth(int monthNumber) {
        if (!months.containsKey(monthNumber)) {
            String monthName = getMonthName(monthNumber);
            months.put(monthNumber, new Mesiac(monthNumber, monthName));
        }
        return months.get(monthNumber);
    }

    private String getMonthName(int monthNumber) {
        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                throw new IllegalArgumentException("Invalid month number: " + monthNumber);
        }
    }
}
