package com.tcc.comparador.boot.dao;

import com.tcc.comparador.boot.domain.Usuario;

import java.util.List;

public interface UsuarioDao {

    void save(Usuario usuario);

    void update(Usuario usuario);

    void delete(Long id);

    Usuario findById(Long id);

    List<Usuario> findAll();
}
