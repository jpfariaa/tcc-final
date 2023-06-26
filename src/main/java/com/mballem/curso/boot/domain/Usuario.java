package com.mballem.curso.boot.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
@Entity
@Table(name = "TB_USUARIO")
public class Usuario extends AbstractEntity<Long> {

    @NotBlank(message = "O nome do usuário é obrigatório.")
    @Column(name = "NOME_USUARIO", nullable = false, unique = true, length = 60)
    private String nome;

    @NotBlank(message = "O email do usuário é obrigatório.")
    @Column(name = "EMAIL_USUARIO", nullable = false, unique = true, length = 40)
    private String email;

    @NotBlank(message = "A senha do usuário é obrigatória.")
    @Column(name = "SENHA_USUARIO", nullable = false, unique = true, length = 32)
    private String senha;

    @NotBlank(message = "O login do usuário é obrigatório.")
    @Column(name = "LOGIN_USUARIO", nullable = false, unique = true, length = 20)
    private String login;

    @OneToMany(mappedBy = "usuario")
    private List<WishList> wishList;
}
