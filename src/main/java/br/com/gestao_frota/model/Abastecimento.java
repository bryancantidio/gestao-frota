package br.com.gestao_frota.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@Entity 
public class Abastecimento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne 
    @NotNull 
    private Veiculo veiculo;
    @NotNull
    private LocalDate data;
    @NotNull 
    private LocalTime horario;
    @NotNull 
    @Positive 
    private Double litros;
    @NotNull 
    @Positive 
    private Double valorTotal;
    private Double precoPorLitro;
    @NotNull
    @PositiveOrZero
    private Double kmHorimetro;
    @NotBlank 
    private String posto;
    private String observacoes;
    
    public Long getId() {
        return id;
    }
    public Veiculo getVeiculo() {
        return veiculo;
    }
    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public LocalTime getHorario() {
        return horario;
    }
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    public Double getLitros() {
        return litros;
    }
    public void setLitros(Double litros) {
        this.litros = litros;
    }
    public Double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Double getPrecoPorLitro() {
        return precoPorLitro;
    }
    public void setPrecoPorLitro(Double precoPorLitro) {
        this.precoPorLitro = precoPorLitro;
    }
    public Double getKmHorimetro() {
        return kmHorimetro;
    }
    public void setKmHorimetro(Double kmHorimetro) {
        this.kmHorimetro = kmHorimetro;
    }
    public String getPosto() {
        return posto;
    }
    public void setPosto(String posto) {
        this.posto = posto;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    
}
