package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.WishList;
import org.springframework.stereotype.Repository;

@Repository
public class WishListDaoImpl extends AbstractDao<WishList, Long> implements WishListDao {
}
