package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		String nome = "Leonardo"; //Literal
		String outro = new String("Java"); //Má pratica
		
		//Trocando letras/char
		String resultado = outro.replace("a" , "o");
		
		System.out.println(resultado);
		
		//mudando para letra minuscula
		resultado  = nome.toLowerCase();
		System.out.println(resultado);

		//mudando para letra maiuscula
		resultado = outro.toUpperCase();		
		System.out.println(resultado);
		
		//pegando char
		char c = nome.charAt(2);
		System.out.println(c);
		
		//Pegado index da primeira letra da string
		int posicao = nome.indexOf("nardo");
		System.out.println(posicao);
		
		//Pegando a partir do index da string 
		String substring = outro.substring(2);
		System.out.println(substring);
		
		//mostra todas as caracteres linha por linha usando um laço for junto com os métodos length e charAt:
		for(int i =0 ; i < outro.length() ; i++) {
			System.out.println(outro.charAt(i));
		}
		
		
		
	}

}
