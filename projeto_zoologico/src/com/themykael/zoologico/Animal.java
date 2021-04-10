package com.themykael.zoologico;

public class Animal {

	private String nome;
	private double tamanho;
	private int patas = 4;
	private String cor;
	private String habitat;
	private double velocidade;
	
	public void setNome(String nome) {
		this.nome = nome;
		System.out.println("Animal: " + this.nome);
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
		System.out.println("Tamanho: " + this.tamanho + " cm");
	}
	
	public void setPatas(int patas) {
		this.patas = patas;
		System.out.println("Patas: " + this.patas);
	}
	
	public void setCor(String cor) {
		this.cor = cor;
		System.out.println("Cor: " + this.cor);
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
		System.out.println("Habitat: " + this.habitat);
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
		System.out.println("Velocidade: " + this.velocidade + " m/s");
	}
}