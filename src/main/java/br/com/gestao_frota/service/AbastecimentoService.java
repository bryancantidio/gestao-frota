package br.com.gestao_frota.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gestao_frota.exception.AbastecimentoNaoEncontradoException;
import br.com.gestao_frota.model.Abastecimento;
import br.com.gestao_frota.repository.AbastecimentoRepository;

@Service
public class AbastecimentoService {
    private final AbastecimentoRepository abastecimentoRepository;

    public AbastecimentoService(AbastecimentoRepository abastecimentoRepository) {
        this.abastecimentoRepository = abastecimentoRepository;
    }

    public Abastecimento salvar(Abastecimento abastecimento) {
        abastecimento.setPrecoPorLitro(abastecimento.getValorTotal() / abastecimento.getLitros());

        return abastecimentoRepository.save(abastecimento);
    }

    public List<Abastecimento> listarTodos() {
        return abastecimentoRepository.findAll();
    }

    public Abastecimento buscarPorId(Long id) {
        return abastecimentoRepository.findById(id)
                .orElseThrow(() -> new AbastecimentoNaoEncontradoException("Abastecimento não encontrado"));
    }

    public void excluir(Long id) {
        if (!abastecimentoRepository.existsById(id))
            throw new AbastecimentoNaoEncontradoException("Abastecimento não encontrado");

        abastecimentoRepository.deleteById(id);

    }

    public Abastecimento atualizar(Long id, Abastecimento dados){
        Abastecimento abastecimento = abastecimentoRepository.findById(id).orElseThrow(()-> new AbastecimentoNaoEncontradoException("Abastecimento não encontrado"));

        abastecimento.setVeiculo(dados.getVeiculo());
        abastecimento.setData(dados.getData());
        abastecimento.setHorario(dados.getHorario());
        abastecimento.setLitros(dados.getLitros());
        abastecimento.setValorTotal(dados.getValorTotal());
        abastecimento.setKmHorimetro(dados.getKmHorimetro());
        abastecimento.setPosto(dados.getPosto());
        abastecimento.setObservacoes(dados.getObservacoes());

        abastecimento.setPrecoPorLitro(dados.getValorTotal() / dados.getLitros());
        
        return abastecimentoRepository.save(abastecimento);
    }
}
