package com.app.invoice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/")
    public String index() {
        return "dashboard/index";
    }

    @GetMapping("/modulos")
    public String Modulos() {
        return "modulos/index";
    }

    @GetMapping("/cuentas")
    public String Cuentas() {
        return "cuentas/index";
    }

    @GetMapping("/config")
    public String Config() {
        return "config/index";
    }

}
