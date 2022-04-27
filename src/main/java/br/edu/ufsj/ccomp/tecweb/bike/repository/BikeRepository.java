package br.edu.ufsj.ccomp.tecweb.bike.repository;

import br.edu.ufsj.ccomp.tecweb.bike.domain.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
