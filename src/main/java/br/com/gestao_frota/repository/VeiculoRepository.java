package br.com.gestao_frota.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gestao_frota.model.Veiculo;

public interface  VeiculoRepository extends JpaRepository<Veiculo, Long>{
    
}
