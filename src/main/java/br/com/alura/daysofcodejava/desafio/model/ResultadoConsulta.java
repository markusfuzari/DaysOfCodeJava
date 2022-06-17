package br.com.alura.daysofcodejava.desafio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class ResultadoConsulta {

    @JsonProperty(value = "items")
    private List<Filme> filmes;

    @JsonProperty(value = "errorMessage")
    private String errorMessage;
}
