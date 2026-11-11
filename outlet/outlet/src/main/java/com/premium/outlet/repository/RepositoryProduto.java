package com.premium.outlet.repository;

import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {
    Page<Produto> findByTipo(String tipo, Pageable pageable);

    Page<Produto> findByMarca(String marca, Pageable pageable);

    Page<Produto> findByTipoContainingIgnoreCase(String tipo, Pageable pageable);
}
