package br.com.webprojectMaven.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CODIGO")
	private int codigo;
	@Column(name = "NOME", length = 200, nullable = false)
	private String nome;
	@Column(name = "ORCAMENTO", nullable = false)
	private Double orcamento;

	public Departamento() {

	}

	public Departamento(String nome, Double orcamento) {
		this.nome = nome;
		this.orcamento = orcamento;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getOrcamento() {
		return orcamento;
	}

	public void setOrcamento(Double orcamento) {
		this.orcamento = orcamento;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nome=" + nome + ", orcamento=" + orcamento + "]";
	}

}
