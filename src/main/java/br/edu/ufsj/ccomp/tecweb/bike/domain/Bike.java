package br.edu.ufsj.ccomp.tecweb.bike.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "bike")
@Getter @Setter
public class Bike {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "aro")
    private Integer aro;

    @Column(name = "preco")
    private BigDecimal preco;

    @Column(name = "cor")
    private String cor;
}
