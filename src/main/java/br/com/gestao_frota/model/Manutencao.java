package br.com.gestao_frota.model;

import java.time.LocalDate;

import jakarta.persistence.Id;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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



}
