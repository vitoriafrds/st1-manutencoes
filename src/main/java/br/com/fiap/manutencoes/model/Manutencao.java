package br.com.fiap.manutencoes.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Manutencao {
    @JsonProperty("tipo_manutencao")
    private int tipo;

    @JsonProperty("componente")
    private int componente;
}
