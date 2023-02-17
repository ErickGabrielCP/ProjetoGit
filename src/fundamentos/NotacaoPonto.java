package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
	
		String s = "Bom dia X";
		s = s.replace("X", "senhora");     // substituiu o X por "senhora" e logo depois colocou em maiusculo.
		s = s.toUpperCase();      //s.toUpperCase(); o "s = s.toUpperCase();" ,
								  //esta fazendo com que todas as letras fiquem maiusculas.
		s = s.concat("!!!");
		
		System.out.println(s);
		
		System.out.println("Leo".toUpperCase()); // toUpperCase sendo utilizado dentro do sysout.
		
		//ou pode ser feito assim ...
		
		String x = "Leo".toUpperCase();
		System.out.println(x);
		
		String t = "eu sou muito bom de ZED".toLowerCase();    //exemplo de outro..
		System.out.println(t);
		
		String y = "Bom dia X".replace("X", "Erick");//o replace substituiu o X por "Erick"
		System.out.println(y);
		
		String u = "Bom dia X"
				.replace("X", "Erick")
				.toUpperCase()
				.concat(" !@#$");// o concat, concatena, e modo mais arrumado.
				
		System.out.println(u);
		
		//tipos primitivos nao tem o operador "."
	
	}
}
