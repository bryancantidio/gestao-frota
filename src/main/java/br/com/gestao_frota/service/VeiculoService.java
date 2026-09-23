package br.com.gestao_frota.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gestao_frota.model.Veiculo;
import br.com.gestao_frota.repository.VeiculoRepository;

@Service
public class VeiculoService {
    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository){
        this.veiculoRepository=veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo){
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos(){
        return veiculoRepository.findAll();
    }
    
}
