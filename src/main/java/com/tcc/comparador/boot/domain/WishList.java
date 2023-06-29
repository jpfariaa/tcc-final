package com.tcc.comparador.boot.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "TB_WISHLIST")
public class WishList extends AbstractEntity<Long> {

    @NotBlank(message = "O campo 'GPU' não pode estar vazio.")
    @Column(name = "GPU", length = 100)
    private String gpu;

    @NotBlank(message = "O campo 'Cooler' não pode estar vazio.")
    @Column(name = "COOLER", length = 100)
    private String cooler;

    @NotBlank(message = "O campo 'Processador' não pode estar vazio.")
    @Column(name = "PROCESSADOR", length = 100)
    private String processador;

    @NotBlank(message = "O campo 'Placa mãe' não pode estar vazio.")
    @Column(name = "PLACA_MAE", length = 100)
    private String placaMae;

    @NotBlank(message = "O campo 'Fonte' não pode estar vazio.")
    @Column(name = "FONTE", length = 100)
    private String fonte;

    @NotBlank(message = "O campo 'HD' não pode estar vazio.")
    @Column(name = "HD", length = 100)
    private String hd;

    @NotBlank(message = "O campo 'RAM' não pode estar vazio.")
    @Column(name = "RAM", length = 100)
    private String ram;

    @NotBlank(message = "O campo 'SSD' não pode estar vazio.")
    @Column(name = "SSD", length = 100)
    private String ssd;

    @NotBlank(message = "O campo 'Gabinete' não pode estar vazio.")
    @Column(name = "GABINETE", length = 100)
    private String gabinete;

    @NotBlank(message = "O campo 'Monitor' não pode estar vazio.")
    @Column(name = "MONITOR", length = 100)
    private String monitor;

    @ManyToOne
    @JoinColumn(name = "id_usuario_fk")
    private Usuario usuario;
}
