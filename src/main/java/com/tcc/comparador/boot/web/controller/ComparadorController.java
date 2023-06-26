package com.tcc.comparador.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ComparadorController {

    @GetMapping("/comparador")
    public String comparador() {
        return "comparador/comparar";
    }

    @PostMapping("/comparar")
    public String comparar() {
        return null;
    }
}
