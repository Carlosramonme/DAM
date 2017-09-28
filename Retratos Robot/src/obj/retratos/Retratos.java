package obj.retratos;

public class Retratos {

//	private String ojos;
//	private String pelo;
//	private String nariz;
//	private String boca;
	
	
	public void imprimir(int ojos, int pelo, int nariz, int boca) {

	switch (pelo) {
	case 1:
		System.out.println("WWWWWWWWW");
		break;	
	case 2:
		System.out.println("\\\\//////");
		break;
	case 3:
		System.out.println("|\"\"\"\"\"\"\"|");
		break;
	case 4:
		System.out.println("|||||||||");
		break;

	default:
		break;
	}
	
	switch (ojos) {
	case 1:
		System.out.println("|  O O  |");
		break;	
	case 2:
		System.out.println("|- (·  ·) -|");
		break;
	case 3:
		System.out.println("|- (o  o) -|");
		break;
	case 4:
		System.out.println("|  \\  /  |");
		break;

	default:
		break;
	}
	
	switch (nariz) {
	case 1:
		System.out.println("@   J   @");
		break;	
	case 2:
		System.out.println("{  \"  }");
		break;
	case 3:
		System.out.println("[   j   ]");
		break;
	case 4:
		System.out.println("<  -  >");
		break;

	default:
		break;
	}
	
	switch (boca) {
	case 1:
		System.out.println("|  ===  |");
		break;	
	case 2:
		System.out.println("|  -  |");
		break;
	case 3:
		System.out.println("|  ___  |");
		break;
	case 4:
		System.out.println("|  ---  |");
		break;

	default:
		break;
	}
	
	System.out.println(" \\_____/");
		
	}
	
}
