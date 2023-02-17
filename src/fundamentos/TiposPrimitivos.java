package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23; 
		
		short numeroDeVoos = 542;
		
		int id = 56789;
		
		long pontosAcumulados = 3_134_845_223L; // letra L sendo utilizada para tranformar int em long
												// o _ sendo usado para separar o  numero para facilitar a leitura
												
		//Tipos numericos reais
		float salario = 11_445.44F;		// F sendo utilizado para colocar o valor em float
		
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true or false
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println("Dias de empresa: "+ anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println("Numero de voos: "+ numeroDeVoos);
		
		//Pontos por real
		System.out.println("pontos acumulados pelas vendas" + pontosAcumulados / vendasAcumuladas);
		
		//quando o id ganha
		System.out.println(id + ": ganha ->" + salario);
		
		// ferias
		System.out.println("Esta de ferias? " + estaDeFerias);
		
		//status
		System.out.println("status: "+ status);
		
	}
}
         //foram utilizados nesse exercicio todos os tipos primitivos

