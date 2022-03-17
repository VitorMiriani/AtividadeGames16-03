package com.example.fiap.appgames.games.model;

public class Game {

	private String nome;
	private Integer preco;
	private String categoria;
	private String plataforma;
	private String	multiplayer;
	private Double  avaliacao;

	public Game(String nome, Integer preco, String categoria, String plataforma, String multiplayer, Double avaliacao) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.categoria = categoria;
		this.plataforma = plataforma;
		this.multiplayer = multiplayer;
		this.avaliacao   = avaliacao;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getMultiplayer() {
		return multiplayer;
	}

	public void setMultiplayer(String multiplayer) {
		this.multiplayer = multiplayer;
	}

	public Double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	

}
