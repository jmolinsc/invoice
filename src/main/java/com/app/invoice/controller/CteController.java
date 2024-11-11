package com.app.invoice.controller;

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

import com.app.invoice.datatable.PagingRequest;
import com.app.invoice.model.AE;
import com.app.invoice.model.Alm;
import com.app.invoice.model.Condicion;
import com.app.invoice.model.Cte;
import com.app.invoice.model.Listaprecios;
import com.app.invoice.model.Pais;
import com.app.invoice.repository.CteRepository;
import com.app.invoice.service.CondicionService;
import com.app.invoice.service.CteService;
import com.app.invoice.service.DepartamentoService;
import com.app.invoice.service.ListapreciosService;
import com.app.invoice.service.MunicipioService;
import com.app.invoice.service.PaisService;

@Controller
@RequestMapping("cte")
public class CteController {

    @Autowired
    CteService cteService;

    @Autowired
    CteRepository cteRepository;

    @Autowired
    PaisService paisService;

    @Autowired
    MunicipioService municipioService;

    @Autowired
    DepartamentoService departamentoService;

    @Autowired
    CondicionService condicionService;

    @Autowired
    ListapreciosService listapreciosService;

    public String action = "Add";

    @GetMapping
    public String index() {
        // return "redirect:/cte";
        return "cte/list";
    }

    @GetMapping(value = "/{pageNumber}")
    public String list(@PathVariable Integer pageNumber, Model model) {

        PageRequest pageRequest = PageRequest.of(pageNumber - 1, 5, Sort.Direction.ASC, "cliente");
        Page<Cte> page = cteRepository.findAll(pageRequest);
        int current = page.getNumber() + 1;
        int begin = Math.max(1, current - 5);
        int end = Math.min(begin + 10, page.getTotalPages());

        model.addAttribute("list", page);
        model.addAttribute("beginIndex", begin);
        model.addAttribute("endIndex", end);
        model.addAttribute("currentIndex", current);

        return "cte/list";

    }

    @GetMapping("/add")
    public String add(Model model) {
        model.addAttribute("cte", new Cte());
        model.addAttribute("cbopais", paisService.findAllPais());
        model.addAttribute("cboMuncipios", municipioService.findAllMunicipios());
        model.addAttribute("cboDepartamentos", departamentoService.findAllDepartamentos());
        model.addAttribute("cbCondicionescredito", condicionService.findAllCondiciones());
        model.addAttribute("cboListaprecios", listapreciosService.findAll());
        return "cte/form";
    }

    @GetMapping("/edit/{cliente}")
    public String edit(@PathVariable String cliente, Model model) {
        model.addAttribute("cte", cteService.findById(cliente));
        model.addAttribute("cbopais", paisService.findAllPais());
        model.addAttribute("cboMuncipios", municipioService.findAllMunicipios());
        model.addAttribute("cboDepartamentos", departamentoService.findAllDepartamentos());
        model.addAttribute("cbCondicionescredito", condicionService.findAllCondiciones());
        model.addAttribute("cboListaprecios", listapreciosService.findAll());
        return "cte/form";
    }

    @PostMapping(value = "/save")
    public String save(Cte cte, final RedirectAttributes ra) {
        Cte save = cteService.save(pre_save(cte));
        ra.addFlashAttribute("successFlash", "Cliente creado exitosamente.");
        return "redirect:/cte/edit/" + save.getCliente();
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {

        // cteService.delete(id);
        return "redirect:/cte";

    }

    @PostMapping("/data")
    @ResponseBody
    public com.app.invoice.datatable.Page<Cte> getPaginatedDatatable(
            @RequestBody PagingRequest pagingRequest, Model model) {

        return cteService.getPaginatedDatatable(pagingRequest);
    }

    public Cte pre_save(Cte cte) {

        if (cte.getAe().getId() == null) {
            cte.setAe(new AE());
        }
        return cte;
    }
}
