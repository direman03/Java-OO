package br.edu.unifcv.faculdade;

import br.edu.unifcv.faculdade.model.Calculadora;
import br.edu.unifcv.faculdade.model.RealizarCalculo;
import br.edu.unifcv.faculdade.model.Somar;
import br.edu.unifcv.faculdade.model.Subtrair;

public class App 
{
    public static void main( String[] args )
    {
      
    	
    	int opcao = 0;
    	Calculadora calculadora = null;
    	
    	switch (opcao) {
		case 0:
			calculadora = new Somar();
			break;
		case 1:
			calculadora = new Subtrair();
			break;
		default:
			break;
		}
    	RealizarCalculo realizarCalculo = new RealizarCalculo(calculadora);
    	realizarCalculo.realizarCalculo();
    }
}
