package br.edu.ufsj.ccomp.tecweb.bike.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class Bike {

    private Long id;
    private String nome;
    private String modelo;
    private String marca;
    private Integer aro;
    private BigDecimal preco;
    private String cor;


}
