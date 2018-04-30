package br.com.exemplo.estudo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue
	private Long id;

	private String nomeJogo;
	private String desenvolvedor;
	private String distribuidor;
	private int anoLancamento;
	private String descricao;
	
	public Portfolio() {
		
	}
	
	public Portfolio(String nomeJogo, String desenvolvedor, String distribuidor, int anoLancamento, String descricao) {
		super();
		this.nomeJogo = nomeJogo;
		this.desenvolvedor = desenvolvedor;
		this.distribuidor = distribuidor;
		this.anoLancamento = anoLancamento;
		this.descricao = descricao;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNomeJogo() {
		return nomeJogo;
	}
	
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	
	public String getDesenvolvedor() {
		return desenvolvedor;
	}
	
	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}
	
	public String getDistribuidor() {
		return distribuidor;
	}
	
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	
	public int getAnoLancamento() {
		return anoLancamento;
	}
	
	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
