package br.com.jackson.meta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jackson.meta.entites.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {

}
