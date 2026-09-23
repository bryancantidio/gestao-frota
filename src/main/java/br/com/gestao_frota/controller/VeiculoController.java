package br.com.gestao_frota.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gestao_frota.model.Veiculo;
import br.com.gestao_frota.service.VeiculoService;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService){
        this.veiculoService=veiculoService;
    }

    @GetMapping 
    public List<Veiculo> listarTodos(){
        return veiculoService.listarTodos();
    }

    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo veiculo){
        return veiculoService.salvar(veiculo);
    }

    @GetMapping("/{id}")
    public Veiculo buscarPorId(@PathVariable Long id){
        return veiculoService.buscarPorId(id);
    } 

    @PutMapping("/{id}")
    public Veiculo atualizar (@PathVariable Long id, @RequestBody Veiculo veiculo){
        return veiculoService.atualizar(id, veiculo);
    } 

    @DeleteMapping("/{id}")
    public void excluir (@PathVariable Long id){
        veiculoService.excluir(id);
    }
    
}
