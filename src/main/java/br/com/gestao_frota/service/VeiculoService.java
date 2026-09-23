package br.com.gestao_frota.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.gestao_frota.exception.VeiculoNaoEncontradoException;
import br.com.gestao_frota.model.Veiculo;
import br.com.gestao_frota.repository.VeiculoRepository;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvar(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Veiculo buscarPorId(Long id) {
        return veiculoRepository.findById(id).orElseThrow(()-> new VeiculoNaoEncontradoException("Veículo não encontrado"));
    }

    public Veiculo atualizar(Long id, Veiculo dados) {
        Veiculo veiculo = veiculoRepository.findById(id).orElse(null);

        if (veiculo == null) {
            return null;
        }

        veiculo.setPlaca(dados.getPlaca());
        veiculo.setPatrimonio(dados.getPatrimonio());
        veiculo.setMarca(dados.getMarca());
        veiculo.setModelo(dados.getModelo());
        veiculo.setAno(dados.getAno());
        veiculo.setCategoria(dados.getCategoria());
        veiculo.setKmHorimetro(dados.getKmHorimetro());
        veiculo.setTipoCombustivel(dados.getTipoCombustivel());
        veiculo.setStatus(dados.getStatus());

        return veiculoRepository.save(veiculo);

    }

    public void excluir(Long id) {
        if(!veiculoRepository.existsById(id))
            throw new VeiculoNaoEncontradoException("Veiculo não econtrado");

        veiculoRepository.deleteById(id);
    }
}
