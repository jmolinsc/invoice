package com.app.invoice.commons;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<SelectOption> cboEstatusAlm() {
        List<SelectOption> options = new ArrayList<SelectOption>();
        options.add(new SelectOption("ALTA", "ALTA"));
        options.add(new SelectOption("BAJA", "BAJA"));

        return options;
    }
}
