package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {
	
	public static void main(String[] args) {
		
		Object cc = new ContaCorrente(111,222);
		Object cp = new ContaPoupanca(222,111);
		
		System.out.println(cc);
		System.out.println(cp);
		
	}

}
