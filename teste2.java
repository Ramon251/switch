import java.util.Scanner;

public class teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cod, qtd;
		double valor_total = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println(" Produto       | Código     | Valor");
		System.out.println("cachoro quente | 100        | 3.2");
		System.out.println("bauru simples  | 101        | 4.3");
		System.out.println("bauro com ovo  | 102        | 5.5");
		System.out.println("hambúger       | 103        | 3.2");
		System.out.println("cheeseburger   | 104        | 4.3");
		System.out.println("refrigerante   | 105        | 4.0");
		
		System.out.println();
		System.out.println();
		
		
		System.out.println("digite o codigo do produto: ");
		cod = leitor.nextInt();
		
		System.out.println("Digite a quantidade ");
		qtd = leitor.nextInt();
		
		switch(cod) {
		case 100:
		System.out.println("cachorro quente");
		valor_total = qtd * 3.2;
		break;
		
		case 101:
			System.out.println("bauru simples");
			valor_total = qtd * 4.3;
			break;
			
		case 102:
			System.out.println("bauru com ovo");
			valor_total = qtd * 5.5;
			break;
			
		case 103:
			System.out.println("hambúrger");
			valor_total = qtd * 3.2;
			break;
			
		case 104:
			System.out.println("cheeseburger");
			valor_total = qtd * 4.3;
			break;
			
		case 105:
			System.out.println("refrigerante");
			valor_total = qtd * 4.0;
			break;
				
		}
				
			
	}

}
