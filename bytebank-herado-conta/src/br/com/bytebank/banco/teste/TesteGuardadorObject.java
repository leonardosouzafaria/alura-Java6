package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorObject {
	
	public static void main(String[] args) {
		

		GuardadorDeContas guardador =  new GuardadorDeContas();
		
		Conta cc = new ContaCorrente(11,22);
		
		guardador.adiciona(cc);
		
		Conta cc2 = new ContaCorrente(22,33);
		
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getQuantidadeElementos();
		
		System.out.println(tamanho);
		
	}

}
