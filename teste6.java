import java.util.Scanner;

public class teste6 {

	public static void main(String[] args) {
   Scanner leitor = new Scanner(System.in);
   
   int salario, valor, cod;
   int porcentagem, valorporcetagem;
   
   
   System.out.println("   Cargo      |    Codigo     |    Percentual");
   System.out.println("   Diretor    |    001        |       10     ");
   System.out.println("   Engenheiro |    002        |       20     ");
   System.out.println("   Tecnico    |    003        |       30     ");
   System.out.println("   Gerente    |    004        |       10     ");
   System.out.println("   Analista   |    005        |       30     ");
   System.out.println("   Coordenador|    006        |       20     ");
   System.out.println("   Demais     |    007        |       40     ");
   
   

   System.out.println("Qual o codigo?");
   cod = leitor.nextInt();
   
   
   
   
   switch (cod) {
   case 1:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
		break;
	   
   case 2:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
	   break;
	   
   case 3:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
	   break;
	   
   case 4:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
	   break;
	   
   case 5:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
	   break;
	   
   case 6:
	   System.out.println("Qual o salario?");
	   valor = leitor.nextInt();
	   
	   System.out.println("Qual a porcentagem?");
	   porcentagem = leitor.nextInt();
	   
	   System.out.println("Novo salário:"+valor * (porcentagem / 100));
	   break;
	   
   case 7:System.out.println("Qual o salario?");
   valor = leitor.nextInt();
   
   System.out.println("Qual a porcentagem?");
   porcentagem = leitor.nextInt();
   
	   System.out.println("Aos demais funcionariosn novo salário:"+valor * (porcentagem / 100));
       break;
	   
   
	
		
			
   }
	}

}
