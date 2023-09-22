package org.rickyortega.adminlte3.controllers;

import org.rickyortega.adminlte3.models.entity.Empresa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value={"/", "", "/index"})
    public String indexController(Model model){

        Empresa empresa = null;

        model.addAttribute("empresa", empresa);
        model.addAttribute("page_title", "Inicio");
        model.addAttribute("header_title", "Inicio");
        return "index";
    }
}