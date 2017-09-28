import java.util.Scanner;

import obj.retratos.Retratos;

public class RetratosRobot {
	
	Scanner teclado = new Scanner(System.in);
	
	private int ojos;
	private int pelo;
	private int nariz;
	private int boca;
	
	public void pregunta(){
		
		System.out.println("Dime un tipo de Pelo 1-4");
		
		ojos = teclado.nextInt();
		
		System.out.println("Dime un tipo de Ojos 1-4");
		
		pelo = teclado.nextInt();
		
		System.out.println("Dime un tipo de nariz 1-4");
		
		nariz = teclado.nextInt();
		
		System.out.println("Dime un tipo de boca 1-4");
	
		boca = teclado.nextInt();
	}

	public static void main(String[] args) {
		
		RetratosRobot respuesta = new RetratosRobot();
		
		respuesta.pregunta();
		 
		 
		 
		 Retratos retrato;
		 
		 Retratos cara = new Retratos();
		 
		 cara.imprimir(respuesta.ojos, respuesta.pelo, respuesta.nariz, respuesta.boca);
		
		
	
	}






	

	

}
