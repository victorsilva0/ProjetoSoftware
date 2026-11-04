package com.premium.outlet.controller;


import com.premium.outlet.dto.DadosCadastrarRoupa;
import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import com.premium.outlet.repository.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @Autowired
    private RepositoryProduto repositoryProduto;

    // Cadastrar Informações no Banco de Dados
    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastrarRoupa roupa){
        repositoryProduto.save(new Produto(roupa));
    }

    // Consultar Informações no banco de Dados
    @GetMapping
    public Page<DadosListagemProduto> listarRoupa(Pageable pageable){
        return repositoryProduto.findAll(pageable).map(DadosListagemProduto::new);
    }
}
