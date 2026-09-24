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

import br.com.gestao_frota.model.Abastecimento;
import br.com.gestao_frota.service.AbastecimentoService;
import jakarta.validation.Valid;

@RestController 
@RequestMapping("/abastecimentos")
public class AbastecimentoController {
    private final AbastecimentoService abastecimentoService;

    public AbastecimentoController(AbastecimentoService abastecimentoService){
        this.abastecimentoService=abastecimentoService;
    }

    @GetMapping 
    public List<Abastecimento> listarTodos(){
        return abastecimentoService.listarTodos();
    }

    @PostMapping 
    public Abastecimento salvar (@Valid @RequestBody Abastecimento abastecimento){
        return abastecimentoService.salvar(abastecimento);
    }

    @GetMapping ("/{id}")
    public Abastecimento buscarPorId(@PathVariable Long id){
        return abastecimentoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Abastecimento atualizar(@PathVariable Long id, @Valid @RequestBody Abastecimento abastecimento){
        return abastecimentoService.atualizar(id, abastecimento);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        abastecimentoService.excluir(id);
    }
}
