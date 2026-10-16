package br.com.gestao_frota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao_frota.model.Manutencao;

public interface ManutencaoRepository extends JpaRepository<Manutencao, Long>{
    
}
