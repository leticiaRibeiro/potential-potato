package br.com.exemplo.estudo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.exemplo.estudo.modelo.Portfolio;

public interface PortfolioRepository extends JpaRepository<Portfolio, Long> {

}
