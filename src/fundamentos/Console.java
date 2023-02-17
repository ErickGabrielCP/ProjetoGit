package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n\n");

		System.out.println("Bom");
		System.out.println("Dia!");

		System.out.printf("Megasena %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);// %n tbm quebra linha

		System.out.printf("Salario: %.1f%n", 1234.5678); // o %.1f vai mostrar so 1 numero decimal

		System.out.printf("Nome: %s%n", "Joao");

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();

		System.out.print("Digite a sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

		entrada.close();

	}

}
