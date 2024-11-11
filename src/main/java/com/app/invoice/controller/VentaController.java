/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.invoice.controller;

import com.app.invoice.model.Venta;

import com.app.invoice.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author adminit
 */
@Controller
@RequestMapping("venta")
public class VentaController {

    private VentaService ventaService;

    @Autowired
    public void setCustomerService(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping
    public String index() {
        return "redirect:/venta/1";
    }

//    @GetMapping(value = "/{pageNumber}")
//    public String list(@PathVariable Integer pageNumber, Model model) {
//        Page<Venta> page = ventaService.getList(pageNumber);
//
//        int current = page.getNumber() + 1;
//        int begin = Math.max(1, current - 5);
//        int end = Math.min(begin + 10, page.getTotalPages());
//
//        model.addAttribute("list", page);
//        model.addAttribute("beginIndex", begin);
//        model.addAttribute("endIndex", end);
//        model.addAttribute("currentIndex", current);
//        return "venta/list";
//    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("venta", new Venta());
        return "venta/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
//        ventaService.delete(id);
        return "redirect:/venta";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {

//        model.addAttribute("venta", ventaService.get(id));
        return "venta/form";

    }

    @PostMapping(value = "/save")
    public String save(Venta venta, final RedirectAttributes ra) {

//        Venta save = ventaService.save(venta);
        ra.addFlashAttribute("successFlash", "Cliente foi salvo com sucesso.");
        return "redirect:/venta";

    }

}
