import java.util.Scanner;

public class teste3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("|     Menu     |");
		System.out.println("|      1       |");
		System.out.println("|      2       |");
		System.out.println("|      3       |");
		System.out.println("|      4       |");
		
		
		
		System.out.println("Digite uma opção: ");
		menu = leitor.nextInt();
		
		switch(menu) {
		case 1:
		System.out.println("Executa a rotina de inclusão de alunos");
		break;
		case 2:
			System.out.println("Executa a rotina de alteração de alunos");
			break;
		case 3:
			System.out.println("Executa a rotina de exclusão de alunos");
			break;
		case 4:
			System.out.println("Executa a rotina de consulta de alunos");
			break;
		
		}
		

	}

}
