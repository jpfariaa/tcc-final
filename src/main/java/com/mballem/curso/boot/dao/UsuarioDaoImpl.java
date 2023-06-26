package com.mballem.curso.boot.dao;

import com.mballem.curso.boot.domain.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDaoImpl extends AbstractDao<Usuario, Long> implements UsuarioDao {
}
