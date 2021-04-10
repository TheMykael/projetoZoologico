package com.themykael.zoologico.teste;

import com.themykael.zoologico.Mamifero;
import com.themykael.zoologico.Peixe;

public class TestaAnimal {

	public static void main(String[] args) {

		Peixe peixe = new Peixe();
		Mamifero mamifero = new Mamifero();

		System.out.println("Zoológico:");
		System.out.println("------------------------------------");

		mamifero.setNome("Camelo");
		mamifero.setTamanho(150);
		mamifero.setPatas(4);
		mamifero.setCor("Marrom");
		mamifero.setHabitat("Terra");
		mamifero.setVelocidade(2.0);

		System.out.println("------------------------------------");

		peixe.setNome("Tubarão");
		peixe.setTamanho(300);
		peixe.setPatas(0);
		peixe.setCor("Cinzento");
		peixe.setHabitat("Mar");
		peixe.setVelocidade(1.5);
		peixe.setCaracteristicas("Barbatanas e cauda");

		System.out.println("------------------------------------");
		
		Mamifero mamifero2 = new Mamifero();

		mamifero2.setNome("Urso-do-canadá");
		mamifero2.setTamanho(180);
		mamifero2.setPatas(4);
		mamifero2.setCor("Vermelho");
		mamifero2.setHabitat("Terra");
		mamifero2.setVelocidade(0.5);
		mamifero2.setAlimento("Mel");

		System.out.print("------------------------------------");
	}
}