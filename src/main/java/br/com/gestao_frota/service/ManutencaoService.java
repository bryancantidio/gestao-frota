package br.com.gestao_frota.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gestao_frota.exception.ManutencaoNaoEncontrada;
import br.com.gestao_frota.model.Manutencao;
import br.com.gestao_frota.repository.ManutencaoRepository;

@Service 
public class ManutencaoService {

    private ManutencaoRepository manutencaoRepository;

    public ManutencaoService(ManutencaoRepository manutencaoRepository) {
        this.manutencaoRepository = manutencaoRepository;
    }

    public Manutencao salvar(Manutencao manutencao) {
        return manutencaoRepository.save(manutencao);
    }

    public List<Manutencao> listarTodos() {
        return manutencaoRepository.findAll();
    }

    public Manutencao buscarPorId(long id) {
        return manutencaoRepository.findById(id).orElseThrow(() -> new ManutencaoNaoEncontrada("Manutenção não encontrada"));
    }

    public Manutencao atualizar(Long id, Manutencao dados) {
        Manutencao manutencao = manutencaoRepository.findById(id)
                .orElseThrow(() -> new ManutencaoNaoEncontrada("Manutenção não encontrada"));

        manutencao.setVeiculo(dados.getVeiculo());
        manutencao.setTipo(dados.getTipo());
        manutencao.setData(dados.getData());
        manutencao.setServico(dados.getServico());
        manutencao.setCusto(dados.getCusto());
        manutencao.setKmHorimetro(dados.getKmHorimetro());
        manutencao.setOficina(dados.getOficina());
        manutencao.setProximaManutencao(dados.getProximaManutencao());
        manutencao.setObservacoes(dados.getObservacoes());

        return manutencaoRepository.save(manutencao);
    }

    public void excluir(Long id){
      if(!manutencaoRepository.existsById(id))
         throw new ManutencaoNaoEncontrada("Manutenção não encontrada");
      
      manutencaoRepository.deleteById(id);
   }
}
