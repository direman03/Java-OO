package br.edu.unifcv.faculdade.model;

public class RealizarCalculo {
	
	private Calculadora calculadora;
	
	public RealizarCalculo(Calculadora calculadora) {
		this.calculadora = calculadora;
	}

	public void realizarCalculo() {
		this.calculadora.Calcular(1, 1);
		this.calculadora.Resultado();
	}
}
