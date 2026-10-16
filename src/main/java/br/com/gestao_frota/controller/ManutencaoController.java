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

import br.com.gestao_frota.model.Manutencao;
import br.com.gestao_frota.service.ManutencaoService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/manutencoes")
public class ManutencaoController {
    private final ManutencaoService manutencaoService;

    public ManutencaoController(ManutencaoService manutencaoService) {
        this.manutencaoService = manutencaoService;
    }

    @GetMapping
    public List<Manutencao> listarTodos() {
        return manutencaoService.listarTodos();
    }

    @PostMapping
    public Manutencao salvar(@Valid @RequestBody Manutencao manutencao) {
        return manutencaoService.salvar(manutencao);
    }

    @GetMapping("/{id}")
    public Manutencao buscarPorId(@PathVariable Long id) {
        return manutencaoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Manutencao atualizar(
            @PathVariable Long id,
            @Valid @RequestBody Manutencao manutencao) {
        return manutencaoService.atualizar(id, manutencao);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        manutencaoService.excluir(id);
    }
}
