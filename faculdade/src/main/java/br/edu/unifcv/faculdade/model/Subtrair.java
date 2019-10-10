package br.edu.unifcv.faculdade.model;

public class Subtrair implements Calculadora{
	
	private Integer subtrair;

	public void Calcular(Integer valor1, Integer valor2) {
		this.subtrair = valor1 - valor2;
	}

	public void Resultado() {
		System.out.println(subtrair);
	}
	

}
