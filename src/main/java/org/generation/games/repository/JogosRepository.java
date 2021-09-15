package org.generation.games.repository;

import java.util.List;

import org.generation.games.model.Jogos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogosRepository extends JpaRepository<Jogos, Long> {
	public List<Jogos>findAllByJogosContainingIgnoreCase(String jogos);
}
