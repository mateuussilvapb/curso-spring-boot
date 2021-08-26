package br.com.mateuussilvapb.exerciciossb.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotBlank
	private String nome;
	
	@Min(value = 0)
	private double preco;
	
	@Min(value = 0)
	@Max(value = 1)
	private double desconto;

	public Produto() {
	}

	public Produto(String nome, double preco, double desconto) {
		setPreco(preco);
		setDesconto(desconto);
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		if (desconto >= 0.01 && desconto <= 1.0) {
			this.desconto = desconto;
		}
	}

}
