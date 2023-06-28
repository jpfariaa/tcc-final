package com.tcc.comparador.boot.web.controller;

import com.tcc.comparador.boot.domain.WishList;
import com.tcc.comparador.boot.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/comparador")
public class ComparadorController {

    @Autowired
    private WishListService service;

    @GetMapping("/cadastrar")
    public String cadastrar(WishList wishlist, Model model) {
        model.addAttribute("wishlist", wishlist);
        return "comparador/cadastro";
    }

    @GetMapping("/resultado")
    public String resultado(WishList wishlist, Model model) {
        model.addAttribute("wishlist", wishlist);
        return "comparador/resultado";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid WishList wishlist, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "cadastro";
        }

        service.salvar(wishlist);
        attr.addFlashAttribute("success", "Lista de Desejos salva com sucesso.");
        return "redirect:/comparador";
    }
}
