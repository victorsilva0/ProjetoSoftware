package com.premium.outlet.repository;

import com.premium.outlet.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryProduto extends JpaRepository<Produto, Long> {
}
