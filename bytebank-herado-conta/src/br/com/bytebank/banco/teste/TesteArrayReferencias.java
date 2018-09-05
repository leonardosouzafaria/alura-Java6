package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		ContaCorrente[] contas = new ContaCorrente[5];
		
		ContaCorrente conta1 = new ContaCorrente(11,22);
		ContaCorrente conta2 = new ContaCorrente(22,33);
		
		contas[0] = conta1;
		contas[1] = conta2;
		
		System.out.println(contas[0].getNumero());
		
	}
	
}
