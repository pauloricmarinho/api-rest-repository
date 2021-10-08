package br.com.prmarinho.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fabricante implements Serializable{

	private static final long serialVersionUID = -5136848696749198455L;

	@Id
	@GeneratedValue
	private Integer id;

	@Column(nullable = false)
	private String nome;
	
	public Fabricante() { }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
