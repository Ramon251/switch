import java.util.Scanner;

public class teste5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codigo ;
		
		int valor;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("     C�digo       |      Condi��o de pagamento                        "  );
		System.out.println("       1          | � vista em dinheiro ou cheque, com 10% de desconto ");
		System.out.println("       2          | � vista com cart�o de credito, com 5% de desconto"  );
		System.out.println("       3          | em 2 vezes, pre�o normal de etiqueta sem juros "    );
		System.out.println("       4          | em 3 vezes, pre�o de etiqueta com acr�simo de 10% " );
		
		
		
		
		
		
		
		
		System.out.println("Digite um c�digo: ");
		codigo = leitor.nextInt();
		
		
		switch(codigo) {
		case 1:
			System.out.println("Digite o valor do produto: ");
			valor = leitor.nextInt();
			
			System.out.println(" Novo valor: "+ (valor-(valor/100*10)));
		    
		    break;
		
		case 2:
			System.out.println("Digite o valor do produto: ");
			valor = leitor.nextInt();
			
			System.out.println(" Novo valor:"+(valor-(valor/100*5)) );
			  
			break;
			
		case 3:
			System.out.println("Digite o valor do produto: ");
			valor = leitor.nextInt();
			
			System.out.println(" Novo valor: "+ valor);
			
			break;
			
		case 4:
			System.out.println("Digite o valor do produto: ");
			valor = leitor.nextInt();
			
			
			
			System.out.println(" Novo valor: "+ (valor+(valor/100*10)));
			 
			break;
		}
		
	}

}
