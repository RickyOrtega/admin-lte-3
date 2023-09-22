package org.rickyortega.adminlte3.controllers;

import org.rickyortega.adminlte3.models.entity.Empresa;
import org.rickyortega.adminlte3.models.service.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private IEmpresaService empresaService;

    @GetMapping(value={ "/gestor"})
    public String empresaController(Model model, Empresa empresa){
        model.addAttribute("page_title", "Gestor de empresas");
        model.addAttribute("header_title", "Gestor de empresas");
        return "index";
    }

    @GetMapping(value="/gestor/{id}")
    public String verEmpresa(@PathVariable(value = "id")Long empresaId, Model model, RedirectAttributes flash){

        Empresa empresa = empresaService.findById(empresaId);

        if (empresa == null) {

            flash.addFlashAttribute("error_empresa_no_existe", "La empresa no existe en la base de datos");

            return "redirect:/empresa/gestor";
        }

        model.addAttribute("empresa", empresa);

        model.addAttribute("page_title", "Gestor de empresas");
        model.addAttribute("header_title", "Gestor de empresas");
        return "index";
    }
}