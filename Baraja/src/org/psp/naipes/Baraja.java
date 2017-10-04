package org.psp.naipes;

import org.psp.naipes.Naipe.palo;
import org.psp.naipes.Naipe.rango;

public class Baraja {

	
	static String miBaraja [][];
	
	public static void crearBaraja()  {
	
		for (palo p : palo.values()) { //4
			
			miBaraja[p.ordinal()][0] = palo.valueOf(p);
			
			for (rango r : rango.values()){ //14
				
				miBaraja[p.ordinal()][r.ordinal()]= p.toString();
				
			}
			
		}
		
	}
	
	public static void main(String[] args) {
			
	crearBaraja();
		
		for (palo p : palo.values()) { //4
			
			
			for (rango r : rango.values()){ //14
				
				System.out.println(miBaraja[p.ordinal()][r.ordinal()]);
				
			}
			
		}
}
	
}
