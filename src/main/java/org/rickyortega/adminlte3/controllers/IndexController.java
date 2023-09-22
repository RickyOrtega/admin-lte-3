package org.rickyortega.adminlte3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value={"/", "", "/index"})
    public String indexController(Model model){
        model.addAttribute("page_title", "Inicio");
        return "index";
    }
}