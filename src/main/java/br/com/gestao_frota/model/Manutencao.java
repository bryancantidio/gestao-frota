package br.com.gestao_frota.model;

import java.time.LocalDate;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public class Manutencao {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull
    private Veiculo veiculo;

    @NotNull 
    @Pattern(regexp = "PREVENTIVA|CORRETIVA", message = "O tipo deve ser 'PREVENTIVA' ou 'CORRETIVA'.")
    private String tipo;

    @NotNull 
    private LocalDate data;

    @NotBlank
    private String servico;

    @NotNull
    @Positive
    private Double custo;

    @NotNull
    @PositiveOrZero
    private Double kmHorimetro;

    @NotBlank
    private String oficina;

    private LocalDate proximaManutencao;

    private String observacoes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public Double getKmHorimetro() {
        return kmHorimetro;
    }

    public void setKmHorimetro(Double kmHorimetro) {
        this.kmHorimetro = kmHorimetro;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public LocalDate getProximaManutencao() {
        return proximaManutencao;
    }

    public void setProximaManutencao(LocalDate proximaManutencao) {
        this.proximaManutencao = proximaManutencao;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }



}
