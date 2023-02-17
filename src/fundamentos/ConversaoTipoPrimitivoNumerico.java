package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
	
		double a = 1;// conversao implicita
		
	System.out.println(a);
	
	float b = (float)1.1234554556574564; // conversao explicita (CAST)
	System.out.println(b);
	
	int c = 4; // byte tem limite 127
	byte d = (byte) c;// conversao de int pra byte
	System.out.println(d);
		
		double e =1.9999999;// int ignora numeros quebrados
		int f = (int)e;//conversao de double para int
		System.out.println(f); 

	}

}
