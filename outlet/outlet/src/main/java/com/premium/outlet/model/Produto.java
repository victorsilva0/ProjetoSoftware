package com.premium.outlet.model;

import com.premium.outlet.dto.AtualizadasDadosRoupa;
import com.premium.outlet.dto.DadosCadastrarRoupa;
import com.premium.outlet.enums.Tamanho;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Produto")
@Table(name = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    private String marca;
    @Enumerated(EnumType.STRING)
    private Tamanho tamanho;
    private int quantidade;
    private double valor;

    public Produto(DadosCadastrarRoupa roupa) {
        this.tipo = roupa.tipo();
        this.marca = roupa.marca();
        this.tamanho = roupa.tamanho();
        this.quantidade = roupa.quantidade();
        this.valor = roupa.valor();
    }

    public void atualizarInformacoes(AtualizadasDadosRoupa dadosRoupa) {
        if (dadosRoupa.tipo() != null && !dadosRoupa.tipo().isEmpty()) {
        this.tipo = dadosRoupa.tipo();
        }

        if (dadosRoupa.marca() != null && !dadosRoupa.marca().isEmpty()) {
            this.marca = dadosRoupa.marca();
        }

        if (dadosRoupa.tamanho() != null) {
            this.tamanho = dadosRoupa.tamanho();
        }

        if (dadosRoupa.quantidade() >=0) {
            this.quantidade = dadosRoupa.quantidade();
        }

        if (dadosRoupa.valor() >=0) {
            this.valor = dadosRoupa.valor();
        }
    }

}
