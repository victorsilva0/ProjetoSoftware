package com.premium.outlet.controller;


import com.premium.outlet.dto.AtualizadasDadosRoupa;
import com.premium.outlet.dto.DadosCadastrarRoupa;
import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import com.premium.outlet.repository.RepositoryProduto;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @Autowired
    private RepositoryProduto repositoryProduto;
    private AtualizadasDadosRoupa dadosRoupa;

    // Cadastrar Informações no Banco de Dados
    @PostMapping
    @Transactional
    public void cadastrarRoupa(@RequestBody DadosCadastrarRoupa roupa){
        repositoryProduto.save(new Produto(roupa));
    }

    // Consultar Informações no banco de Dados
    //Buscar por paginas
    @GetMapping
    public Page<DadosListagemProduto> listarRoupa(Pageable pageable){
        return repositoryProduto.findAll(pageable).map(DadosListagemProduto::new);
    }

    //Buscar por Tipo em pagina especifica
    @GetMapping("/tipo/{tipo}")
    public Page<DadosListagemProduto> listarRoupasPortipo(@PathVariable String tipo, Pageable pageable){
        return repositoryProduto.findByTipo(tipo, pageable).map(DadosListagemProduto::new);
    }

    //Buscar por marca em pagina especifica
    @GetMapping("/marca/{marca}")
    public Page<DadosListagemProduto> listarRoupasPorMarca(@PathVariable String marca, Pageable pageable){
        return repositoryProduto.findByMarca(marca, pageable).map(DadosListagemProduto::new);
    }

    //Buscar por nomes especificos
    @GetMapping("/buscar")
    public Page<DadosListagemProduto> listarRoupasPorBusca(@RequestParam String tipo, Pageable pageable){
        return repositoryProduto.findByTipoContainingIgnoreCase(tipo, pageable).map(DadosListagemProduto::new);
    }


    //Alteração das informações no banco
    @PutMapping
    @Transactional
    public void atualizarRoupa(@RequestBody AtualizadasDadosRoupa dadosRoupa){
        var roupa = repositoryProduto.getReferenceById(dadosRoupa.id());
        roupa.atualizarInformacoes(dadosRoupa);
    }


    //Removendo informação do banco
    @DeleteMapping("{id}")
    @Transactional
    public void deletarRoupa(@PathVariable Long id){}
}
