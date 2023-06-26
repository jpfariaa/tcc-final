package com.tcc.comparador.boot.dao;

import com.tcc.comparador.boot.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long> implements UsuarioDao {
}
