import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int codigo;
		int qtd=0;
		double valor=0;
		double resul=0;
		int aux = 0;
		int codigo1;
		int qtd1=0;
		double valor1=0;
		
		
		Scanner n1 = new Scanner(System.in);
		
		System.out.println("Digite o codigo da peça");
		codigo = n1.nextInt();
		System.out.println("Digite o quantidade da peça");
		qtd = n1.nextInt();
		System.out.println("Digite o valor da peça");
		valor = n1.nextFloat();
		
		System.out.println("Digite o codigo da peça");
		codigo1 = n1.nextInt();
		System.out.println("Digite o quantidade da peça");
		qtd1 = n1.nextInt();
		System.out.println("Digite o valor da peça");
		valor1 = n1.nextDouble();
		
		resul =  qtd*valor + qtd1*valor1;
		
		
	
	System.out.println("Resultado " + resul);
		
		

	}

}
