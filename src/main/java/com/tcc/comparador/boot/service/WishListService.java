package com.tcc.comparador.boot.service;

import com.tcc.comparador.boot.domain.WishList;

import java.util.List;

public interface WishListService {

    void salvar(WishList wishList);

    void editar(WishList wishList);

    void excluir(Long id);

    List<WishList> buscarTodos();

}
