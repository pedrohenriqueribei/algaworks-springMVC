package com.algaworks.cobranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.cobranca.domain.model.Titulo;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
