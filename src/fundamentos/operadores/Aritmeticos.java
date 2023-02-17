package fundamentos.operadores;

public class Aritmeticos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		
		System.out.println("O seu resultado é: " + x + y);
		System.out.println("O seu resultado é: " + (x - y)); 
		System.out.println("O seu resultado é: " + x * y);
		System.out.println("O seu resultado é: " + x / y);
		
		int a = 8;
		int b = 3;
		
		System.out.println("  ");
		System.out.println("O seu resultado é: " + a + b);
		System.out.println("O seu resultado é: " + (a - b)); 
		System.out.println("O seu resultado é: " + a * b);
		System.out.println("O seu resultado é: " + a / b);
		System.out.println("O seu resultado é: " + a / (float) b);
		System.out.println("O seu resultado é: " + a / (double) b);// esta convertendo a variavel (b) para double,
		                                                           //para o numero sair quebrado
		
		System.out.println(8 % 3);
		System.out.println(a % b);// (%) resto da divisao
		
		System.out.println(x + y - a * b);
		
		
		
		
		
	}
}
