package br.com.gestao_frota.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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
    
}
