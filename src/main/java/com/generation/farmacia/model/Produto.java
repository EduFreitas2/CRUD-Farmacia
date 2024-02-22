package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "É obrigatório preencher este atributo!")
	@Size(min = 5, max = 255, message = "Este atributo deve conter no mínimo 5 caracteres e no máximo 255")
	private String nome;
	
	@NotBlank(message = "É obrigatório preencher este atributo!")
	@Size(min = 5, max = 255, message = "Este atributo deve conter no mínimo 5 caracteres e no máximo 255")
	private String foto;
	
	@NotNull(message = "O preco é obrigatório!")
	private float preco;
	
	@NotBlank(message = "É obrigatório preencher este atributo!")
	@Size(min = 5, max = 255, message = "Este atributo deve conter no mínimo 5 caracteres e no máximo 255")
	private String descricao;
	
	@ManyToOne
	private Categoria categoria;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	
}
