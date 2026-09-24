package br.com.gestao_frota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao_frota.model.Abastecimento;

public interface AbastecimentoRepository extends JpaRepository<Abastecimento, Long> {

}