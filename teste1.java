import java.util.Scanner;

public class teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
			
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um codigo");
		nome = leitor.next();
		
		
		switch(nome) {
		case "001":
		
		System.out.println("Parafuso");
		break;
		
		case "002":
			System.out.println("Porca");
			break;
		
		case "003":
			System.out.println("Prego");
			break;
		
		case "004":
			System.out.println("Ferramenta");
			break;
		
		
		default:
		System.out.println("Diversos");
	}
	}

}
