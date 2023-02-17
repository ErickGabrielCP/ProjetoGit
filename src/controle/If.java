package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = scan.nextDouble();
		
		boolean Aprovado = nota >= 7 && nota <= 10;
		
		boolean exame = nota >= 4 && nota < 7;
		
		boolean reprovado = nota >= 0 && nota < 4;
		
		if (Aprovado) {
			System.out.println("Parabens!!");
		}
		if (reprovado) {
			System.out.println("Reprovado");
		}
		if (exame) {
			System.out.println("Exame");
		}
		
		
		
		
		
		
		
		
		scan.close();
	}

}
