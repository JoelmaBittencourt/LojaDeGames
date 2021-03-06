package org.generation.games.repository;

import java.util.List;

import org.generation.games.model.Categoria;
import org.generation.games.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria>findAllByCategoriaContainingIgnoreCase(String categoria);
}
