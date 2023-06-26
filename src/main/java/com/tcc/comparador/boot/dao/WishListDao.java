package com.tcc.comparador.boot.dao;

import com.tcc.comparador.boot.domain.WishList;

import java.util.List;

public interface WishListDao {

    void save(WishList wishList);

    void update(WishList wishList);

    void delete(Long id);

    List<WishList> findAll();
}
