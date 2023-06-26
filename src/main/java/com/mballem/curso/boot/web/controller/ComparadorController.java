package com.mballem.curso.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comparadores")
public class ComparadorController {

    @GetMapping("/comparador")
    public String comparar() {
        return "comparador/comparar";
    }
}
