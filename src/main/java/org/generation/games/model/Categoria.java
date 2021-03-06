package org.generation.games.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@Entity
@Table(name="tb_categoria")
public class Categoria {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;


@NotNull
private String categoria;



@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
@JsonIgnoreProperties("categoria")
private List<Jogos>jogos;



public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public String getCategoria() {
	return categoria;
}



public void setCategoria(String categoria) {
	this.categoria = categoria;
}



public List<Jogos> getJogos() {
	return jogos;
}



public void setJogos(List<Jogos> jogos) {
	this.jogos = jogos;
}
	
	
}
