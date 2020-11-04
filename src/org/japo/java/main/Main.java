package org.japo.java.main;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Main {

    public static final GregorianCalendar CAL
            = new GregorianCalendar();

    public static void main(String[] args) {
        int ds;
        int ms;
        int as;
        ds = CAL.get(Calendar.DATE);
        ms = CAL.get(Calendar.MONTH);
        as = CAL.get(Calendar.YEAR);
        System.out.printf("Fecha del Sistema  %d:%02d:%d%n", ds, ms, as);
    }

}

