package com.tcc.comparador.boot.web.controller;

import com.tcc.comparador.boot.domain.WishList;
import com.tcc.comparador.boot.service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/wishlists")
public class WishListController {

    @Autowired
    private WishListService service;

    @GetMapping("/cadastrar")
    public String cadastrar(WishList wishList) {
        return "wishlist/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap model) {
        model.addAttribute("wishlists", service.buscarTodos());
        return "wishlist/lista";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid WishList wishList, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "wishlist/cadastro";
        }

        service.salvar(wishList);
        attr.addFlashAttribute("success", "WishList inserido com sucesso.");
        return "redirect:/wishlists/cadastrar";
    }

    @PostMapping("/editar")
    public String editar(@Valid WishList wishList, BindingResult result, RedirectAttributes attr) {
        if (result.hasErrors()) {
            return "wishlist/cadastro";
        }

        service.editar(wishList);
        attr.addFlashAttribute("success", "Registro atualizado com sucesso.");
        return "redirect:/wishlists/cadastrar";
    }

    @PostMapping("/excluir/{id}")
    public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
        service.excluir(id);
        attr.addFlashAttribute("success", "WishList excluído com sucesso.");
        return "redirect:/wishlists/listar";
    }
}
