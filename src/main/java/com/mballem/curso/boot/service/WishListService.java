package com.mballem.curso.boot.service;

import com.mballem.curso.boot.domain.WishList;

import java.util.List;

public interface WishListService {

    void salvar(WishList wishList);

    void editar(WishList wishList);

    void excluir(Long id);

    List<WishList> buscarTodos();

}
