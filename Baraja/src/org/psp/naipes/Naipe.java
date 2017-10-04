package org.psp.naipes;

public class Naipe {

	public enum palo {
		PICAS, TREBOLES, CORAZONES, DIAMANTES;
		
	}
	
	public enum rango {	
		AS(1), DOS(2), TRES(3), CUATRO(4), CINCO(5), SEIS(6), SIETE(7), OCHO(8), NUEVE(9), DIEZ(10), J(11), Q(12), K(13);
		
		private int valor;
		
		rango(int valor){
			valor = this.valor;
		}
		
		
		
		
		
	}
	
	
	
}
