package com.themykael.zoologico;

public class Mamifero extends Animal {

	private String alimento;

	@Override
	public void setNome(String nomeMamifero) {
		super.setNome(nomeMamifero);
	}

	@Override
	public void setTamanho(double tamanhoMamifero) {
		super.setTamanho(tamanhoMamifero);
	}

	@Override
	public void setPatas(int patasMamifero) {
		super.setPatas(patasMamifero);
	}

	@Override
	public void setCor(String corMamifero) {
		super.setCor(corMamifero);
	}

	@Override
	public void setHabitat(String habitatMamifero) {
		super.setHabitat(habitatMamifero);
	}

	@Override
	public void setVelocidade(double velocidadeMamifero) {
		super.setVelocidade(velocidadeMamifero);
	}
	
	public void setAlimento(String alimentoMamifero) {
		this.alimento = alimentoMamifero;
		System.out.println("Alimento favorito: " + this.alimento);
	}
}