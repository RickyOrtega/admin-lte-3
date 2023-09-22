package org.rickyortega.adminlte3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {
    @GetMapping(value={ "/gestor"})
    public String indexController(Model model){
        model.addAttribute("page_title", "Gestor de empresas");
        model.addAttribute("header_title", "Gestor de empresas");
        return "index";
    }
}