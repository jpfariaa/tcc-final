package com.tcc.comparador.boot.dao;

import com.tcc.comparador.boot.domain.WishList;
import org.springframework.stereotype.Repository;

@Repository
public class WishListDaoImpl extends AbstractDao<WishList, Long> implements WishListDao {
}
