package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {
 
	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim());// o trim serve para tirar o espaço em branco
		System.out.println("2".equals(s2.trim()));
		
		
		// o .next ja tira os espaços em branco ja o .nextline não
		
		
		entrada.close();
	}	
}
// QUANDO ESTIVER COMPARANDO STRINGS USAR O ( EQUALS E NAO O == ) 