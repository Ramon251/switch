import java.util.Scanner;

public class teste4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nota1, nota2, nota3;
		int media_ponderada = 0 , media_aritimetica = 0;
		int media;
		
		
		Scanner leitor = new Scanner(System.in);
		
		
	
		
		System.out.println("Escolha o tipo de media: media ponderada 1 ou media aritimetica 2");
		media = leitor.nextInt();
		
		
		
		
	
		
		switch (media) {
		case 1:
			System.out.println("Digite a priemria nota: ");
			nota1 = leitor.nextInt();
			
			System.out.println("Digite a Segunda nota: ");
			nota2 = leitor.nextInt();
			
			System.out.println("Digite a terceira nota: ");
			nota3 = leitor.nextInt();
			
		    System.out.println(" média aritimetica:"+ (nota1 * nota2 * nota3) / 3);
		
		break;
			
		case 2:
			
			System.out.println("Digite a priemria nota: ");
			nota1 = leitor.nextInt();
			
			System.out.println("Digite a Segunda nota: ");
			nota2 = leitor.nextInt();
			
			System.out.println("Digite a terceira nota: ");
			nota3 = leitor.nextInt();
			
		    System.out.println(" média ponderada:"+(nota1 * 3 + nota2 * 3 + nota3 * 4) /10);
		
		break;
			
		
		
		
		
		
		
		
		}
		
			
		
		

	}

}
