package com.tcc.comparador.boot.service;

import com.tcc.comparador.boot.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    void salvar(Usuario usuario);

    void editar(Usuario usuario);

    void excluir(Long id);

    Usuario buscarPorId(Long id);

    List<Usuario> buscarTodos();

    boolean usuarioTemWishilist(Long id);
}
