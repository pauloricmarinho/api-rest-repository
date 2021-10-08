package br.com.prmarinho.data.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Equipamento implements Serializable {

	private static final long serialVersionUID = -5283705695089429969L;

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Double valor;
	
	@ManyToOne(optional = false)
	private Fabricante fabricante;
	
	private CategoriaEnum categoria;
	
	public Equipamento() { }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public CategoriaEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		this.categoria = categoria;
	}
}
