package com.app.invoice.controller;

import com.app.invoice.commons.SelectOption;
import com.app.invoice.commons.Utils;
import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.model.Alm;
import com.app.invoice.model.Almgrupo;
import com.app.invoice.model.Art;
import com.app.invoice.repository.AlmRepository;
import com.app.invoice.repository.AlmgrupoRepository;
import com.app.invoice.service.AlmService;
import com.app.invoice.service.AlmgrupoService;

import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("alm")
public class AlmController {

    @Autowired
    AlmRepository almRepository;

    @Autowired
    AlmgrupoService almgrupoService;

    @Autowired
    AlmService almService;

    public String action = "Add";

    @GetMapping
    public String index() {
        return "redirect:/alm/1";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {

        PageRequest pageRequest = PageRequest.of(pageNumber - 1, 5, Sort.Direction.ASC, "almacen");
        Page<Alm> page = almRepository.findAll(pageRequest);
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "alm/list";

    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("alm", new Alm());
        model.addAttribute("almgrupo", almgrupoService.findAllAlta());
        return "alm/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        // almRepository.delete(id);
        return "redirect:/alm";

    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        action = "Edit";
        model.addAttribute("alm", almRepository.findById(id));
        model.addAttribute("almgrupo", almgrupoService.findAllAlta());
        model.addAttribute("listestatus", Utils.cboEstatusAlm());
        return "alm/form";

    }

    @PostMapping(value = "/save")
    public String save(Alm alm, final RedirectAttributes ra) {

        Alm save = almRepository.save(alm);
        ra.addFlashAttribute("successFlash",
                "Almacen " + (action.equals("Edit") ? "Actualizado" : "Creado") + " exitosamente");
        return "redirect:/alm/edit/" + save.getAlmacen();

    }

    @PostMapping("/data")
    @ResponseBody
    public com.app.invoice.datatable.Page<Alm> getPaginatedDatatable(
            @RequestBody PagingRequest pagingRequest, Model model) {

        return almService.getPaginatedDatatable(pagingRequest);
    }

}
