package controle;

import java.util.Scanner;

public class IfDiferente {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		double nota = scan.nextDouble();
		
		boolean aprovado = nota >=7 && nota <= 10;
		
		boolean exame = nota >= 4.5 && nota < 7;
		
		boolean reprovado = nota >= 0 && nota < 4.5;
		
		
		if (aprovado) {
			System.out.println("Aprovado");
			System.out.println("Parabens!!!");
		}
		
		if (exame) {
			System.out.println("exame");
		}
		
		if (reprovado) {
			System.out.println(reprovado);
		}
		
		scan.close();
	}
}
