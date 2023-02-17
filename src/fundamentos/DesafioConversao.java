package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salario: ");
		String valor1 = scan.nextLine().replace(",", ".");
		//o replace serve neste exemplo para que se for colocado uma virgula ele substitui por ponto final
		
		System.out.println("Digite o segundo salario: ");
		String valor2 = scan.nextLine().replace(",", ".");
		
		System.out.println("Digite o terceiro salario: ");
		String valor3 = scan.nextLine().replace(",", ".");
		
		System.out.println("primeiro salario: "+ valor1 + 
				"\nsegundo salario: "+valor2 + "\nterceiro salario: "+valor3 );
		
		double numero1 = Double.parseDouble(valor1);
				
		double numero2 = Double.parseDouble(valor2);
		
		double numero3 = Double.parseDouble(valor3);
		
		double soma = numero1 + numero2 + numero3;
		
		
		System.out.println("A soma é: "+ soma);
		System.out.println("A media é: "+ soma / 3);
		
		scan.close();
		
	}

}
