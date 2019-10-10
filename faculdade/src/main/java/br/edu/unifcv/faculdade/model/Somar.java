package br.edu.unifcv.faculdade.model;

public class Somar implements Calculadora {

	private Integer soma;
	
	public void Calcular(Integer valor1, Integer valor2) {
		this.soma = valor1+valor2;
	}

	public void Resultado() {
		System.out.println(soma);

	}
	

}
