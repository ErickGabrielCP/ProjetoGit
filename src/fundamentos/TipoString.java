package fundamentos;

public class TipoString {

public static void main(String[] args) {
	
	System.out.println("ola pessoal".charAt(2)); // o char esta escolhendo a letra no espaço 2, sendo que começa do 0,
	
	String s = "Boa tarde";
	
	System.out.println(s.concat("!!!"));//String n pode ser alterada
	
	System.out.println(s + "!!!");//String n pode ser alterada
	
	System.out.println(s.startsWith("Boa"));// aqui esta verificando se começa com Boa, maiusculo
	
	System.out.println(s.startsWith("boa"));// aqui esta verificando se começa com boa, minusculo
	
	System.out.println(s.toLowerCase().startsWith("boa"));//transforma em minusculo antes de checar
	
	System.out.println(s.length());//verifica o comprimento
	
	System.out.println(s.endsWith("tarde"));// verifica se termina com tarde
	
	System.out.println(s.equals("boa tarde"));//comparaçao de igualdade
	
	System.out.println(s.equalsIgnoreCase("boa tarde"));//comparaçao de igualdade, que ignora minuscula e maiuscula
	
	var nome = "Pedro";
	
	var sobrenome = "Santos";
	
	var idade = 33;
	var salario = 12345.987;
	
	//System.out.println("Nome: " + nome + " \nSobrenome: " 
	//+ sobrenome + "\nidade:" + idade 
	//+ "\nsalario: " + salario + "\n\n");             
	
	System.out.printf("O senhor %s %s tem %s anos e ganha R$%.2f", nome, sobrenome,idade, salario);
	// o %s esta substituindo pelas variaveis, para simplificar o exemplo abaixo,  R$%.2f o .2 e para mostrar quantas
	// casas decimais aparerão apos o valor do salario.
	//System.out.printf("o senhor " + nome + " " + sobrenome + " tem "+ idade + " anos e recebe R$" + salario);
	
	//String Frase = String.format(("\nO senhor %s %s \ntem %d anos \ne ganha R$%.2f"), nome, sobrenome,idade, salario);
	// os /n estao colocando na linha debaixo, o primeiro \n esta fazendo ficar na linha debaixo do ultimo system.out,
	//para n engolir a primeira frase.
	
	//System.out.println(Frase);
	
	//System.out.println("frase qualquer".concat(" poucas"));
	
	
}
}

