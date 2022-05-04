package br.edu.ufsj.ccomp.tecweb.bike.repository;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Aluguel;
import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AluguelRepository extends JpaRepository<Aluguel, Long> {
}
