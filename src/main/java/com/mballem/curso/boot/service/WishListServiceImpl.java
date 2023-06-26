package com.mballem.curso.boot.service;

import com.mballem.curso.boot.dao.WishListDao;
import com.mballem.curso.boot.domain.WishList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class WishListServiceImpl implements WishListService {

    @Autowired
    private WishListDao dao;

    @Override
    public void salvar(WishList wishList) {
        dao.save(wishList);
    }

    @Override
    public void editar(WishList wishList) {
        dao.update(wishList);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public List<WishList> buscarTodos() {
        return dao.findAll();
    }
}
