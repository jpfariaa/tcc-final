package com.tcc.comparador.boot.service;

import com.tcc.comparador.boot.dao.UsuarioDao;
import com.tcc.comparador.boot.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDao dao;

    @Override
    public void salvar(Usuario usuario) {
        dao.save(usuario);
    }

    @Override
    public void editar(Usuario usuario) {
        dao.update(usuario);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public boolean usuarioTemWishilist(Long id) {
        return !buscarPorId(id).getWishList().isEmpty();
    }
}
