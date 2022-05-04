package br.edu.ufsj.ccomp.tecweb.bike.repository;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import br.edu.ufsj.ccomp.tecweb.bike.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
