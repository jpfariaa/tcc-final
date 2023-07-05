package com.tcc.comparador.boot.web.controller;

import com.tcc.comparador.boot.domain.WishList;
import com.tcc.comparador.boot.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Random;

@Controller
@RequestMapping("/comparador")
public class ComparadorController {

    @Autowired
    private WishListService service;

    @ModelAttribute("wishlist")
    public WishList setupWishListForm() {
        return new WishList();
    }

    @GetMapping("/cadastrar")
    public String cadastrar(WishList wishlist, Model model) {
        model.addAttribute("wishlist", wishlist);
        return "comparador/cadastro";
    }

    @PostMapping("/resultado")
    public String resultado(@ModelAttribute("wishlist") WishList wishlist, Model model) {

        Random rand = new Random();
        int loja1 = rand.nextInt(3501) + 1500; // Gera um número aleatório entre 1500 e 5000
        int loja2 = rand.nextInt(3501) + 1500;

        String classeLoja1 = "price-yellow";
        String classeLoja2 = "price-yellow";

        if(loja1 < loja2){
            classeLoja1 = "price-green";
            classeLoja2 = "price-red";
        }else if(loja1 > loja2){
            classeLoja1 = "price-red";
            classeLoja2 = "price-green";
        }

        model.addAttribute("wishlist", wishlist);
        model.addAttribute("totalLoja1", loja1);
        model.addAttribute("totalLoja2", loja2);
        model.addAttribute("classeLoja1", classeLoja1);
        model.addAttribute("classeLoja2", classeLoja2);
        
        return "comparador/resultado";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid @ModelAttribute("wishlist") WishList wishlist, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "comparador/cadastro";
        }

        service.salvar(wishlist);
        attr.addFlashAttribute("success", "Lista de Desejos salva com sucesso.");
        return "redirect:/comparador/cadastrar";
    }
}
