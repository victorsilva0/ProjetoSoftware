package com.premium.outlet.dto;

import com.premium.outlet.enums.Tamanho;

public record AtualizadasDadosRoupa(
        Long id,
        String tipo,
        String marca,
        Tamanho tamanho,
        int quantidade,
        double valor
) {
}
