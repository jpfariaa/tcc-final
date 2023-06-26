package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.WishList;

import java.util.List;

public interface WishListDao {

    void save(WishList wishList);

    void update(WishList wishList);

    void delete(Long id);

    List<WishList> findAll();
}
