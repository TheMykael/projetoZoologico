package com.themykael.zoologico;

public class Peixe extends Animal {

	private String caracteristicas = "Barbatana e cauda";
	
	@Override
	public void setNome(String nomePeixe) {
		super.setNome(nomePeixe);
	}

	@Override
	public void setTamanho(double tamanhoPeixe) {
		super.setTamanho(tamanhoPeixe);
	}

	@Override
	public void setPatas(int patasPeixe) {
		super.setPatas(patasPeixe);
	}

	@Override
	public void setCor(String corPeixe) {
		super.setCor(corPeixe);
	}

	@Override
	public void setHabitat(String habitatPeixe) {
		super.setHabitat(habitatPeixe);
	}

	@Override
	public void setVelocidade(double velocidadePeixe) {
		super.setVelocidade(velocidadePeixe);
	}
	
	public void setCaracteristicas(String caracteristicasPeixe) {
		this.caracteristicas = caracteristicasPeixe;
		System.out.println("Característica: " + this.caracteristicas);
	}
}