package com.premium.outlet.dto;

import com.premium.outlet.enums.Tamanho;

//Construtor
//Getter
//Setter
public record DadosCadastrarRoupa(
        String tipo,
        String marca,
        Tamanho tamanho,
        int quantidade,
        double valor
) {
}
