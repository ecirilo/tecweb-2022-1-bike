package br.edu.ufsj.ccomp.tecweb.bike.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter
public class Aluguel {

    private Long id;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private Cliente cliente;
    private List<Bike> bikes;
}
