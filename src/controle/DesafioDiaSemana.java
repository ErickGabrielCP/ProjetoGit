package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana: ");
		String Dia = scan.next();
		
		
		if (Dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		}else if(Dia.equalsIgnoreCase("Segunda")) {
			System.out.println(2);
		}else if(Dia.equalsIgnoreCase("terça") 
		|| Dia.equalsIgnoreCase("terca")){      //colocando o || pra mostrar 
			System.out.println(3);              //que pode ser terça sem acento
		}else if(Dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		}else if(Dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}else if(Dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}else if(Dia.equalsIgnoreCase("sábado")
				|| Dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia invalido");
		}
		
		
		
		
		
		
		
		
		scan.close();
	}
}
	
	
	
	
	
	
	
	
	