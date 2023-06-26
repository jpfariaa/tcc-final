package com.tcc.comparador.boot.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_WISHLIST")
public class WishList extends AbstractEntity<Long> {

    @Column(name = "GPU", length = 100)
    private String gpu;

    @Column(name = "COOLER", length = 100)
    private String cooler;

    @Column(name = "PROCESSADOR", length = 100)
    private String processador;

    @Column(name = "PLACA_MAE", length = 100)
    private String placaMae;

    @Column(name = "FONTE", length = 100)
    private String fonte;

    @Column(name = "HD", length = 100)
    private String hd;

    @Column(name = "RAM", length = 100)
    private String ram;

    @Column(name = "SSD", length = 100)
    private String ssd;

    @Column(name = "GABINETE", length = 100)
    private String gabinete;

    @Column(name = "MONITOR", length = 100)
    private String monitor;

    @ManyToOne
    @JoinColumn(name = "id_usuario_fk")
    private Usuario usuario;
}
