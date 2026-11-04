package com.premium.outlet.dto;

import com.premium.outlet.enums.Tamanho;
import com.premium.outlet.model.Produto;

public record DadosListagemProduto(
        Long id,
        String tipo,
        String marca,
        Tamanho tamanho,
        int quantidade,
        double valor
) {

    //Escolhe o que quer listar
    public DadosListagemProduto(Produto produto){
        this(produto.getId(), produto.getTipo(), produto.getMarca(),
                produto.getTamanho(), produto.getQuantidade(), produto.getValor()
        );
    }
}
