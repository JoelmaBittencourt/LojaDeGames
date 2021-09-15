package org.generation.games.model;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name="jogos")
public class Jogos {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	@NotNull
	@Size(min=5,max=20)
	private String jogos;
	@NotNull
	@Size(min=5,max=50)
	private String descricao;
	@NotNull
	private double preço;
	
	
@ManyToOne
@JsonIgnoreProperties("jogos")//relaçao entre tabelas
private Categoria categoria;

@ManyToOne
@JsonIgnoreProperties("postagem")
private Usuario usuario;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getJogos() {
	return jogos;
}

public void setJogos(String jogos) {
	this.jogos = jogos;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public double getPreço() {
	return preço;
}

public void setPreço(double preço) {
	this.preço = preço;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public Usuario getUsuario() {
	return usuario;
}

public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
}



	
	
	
	

