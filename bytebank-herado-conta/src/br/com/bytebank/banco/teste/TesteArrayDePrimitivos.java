package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {
	
	public static void main(String[] args) {
		
		int[] idades = new int[5];
		
		/*idades[0] = 11;
		idades[1] = 15;
		idades[2] = 20;
		idades[3] = 22;
		idades[4] = 30;
		
		int idade4 = idades[3];
		
		System.out.println(idade4);
		
		System.out.println(idades.length);*/
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * 3;
			//System.out.println(idades[i]);
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
	}

}
