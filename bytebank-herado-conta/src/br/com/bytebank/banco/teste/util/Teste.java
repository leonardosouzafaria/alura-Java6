package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
	
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		Conta cc = new ContaCorrente(2123,333);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(1314,222);
		lista.add(cc2);
		
		System.out.println("Tamanho: " + lista.size());
		
		System.out.println(lista.get(0));	
		
		Conta ref = (Conta)lista.get(1);
		System.out.println(ref);
		
		lista.remove(0);
		
		System.out.println("Tamanho: " + lista.size());
		
		Conta cc3 = new ContaCorrente(999,2444);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(2288,888);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("------------------");
		
		for(Object obj : lista){
			System.out.println(ref);	
		}
	}

}
