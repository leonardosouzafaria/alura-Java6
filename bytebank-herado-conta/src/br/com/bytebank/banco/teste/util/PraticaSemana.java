package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class PraticaSemana {

	public static void main(String[] args) {

		 criaArray();
		 System.out.println("-----------------------------------------------------------");
		 criaListaArray();

	}

	public static void criaListaArray() {
		ArrayList<Conta> ref = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(123, 345);
		Conta cc2 = new ContaCorrente(234, 456);
		Conta cc3 = new ContaCorrente(224, 336);
		Conta cc4 = new ContaCorrente(444, 444);

		System.out.println(ref.size());
		System.out.println(ref.isEmpty());

		ref.add(cc);
		System.out.println(ref.size());
		ref.add(cc2);
		ref.add(cc3);
		ref.add(cc4);

		System.out.println(ref.size());

		ref.remove(cc3);

		System.out.println(ref.size());

		System.out.println(ref.get(0));
		System.out.println(ref.get(2));

		System.out.println("------------------");

		for (Object obj : ref) {
			System.out.println(obj);
		}
	}

	// pratica array normal
	public static void criaArray() {

		Conta refs[] = new Conta[5];

		Conta cc = new ContaCorrente(123, 345);
		Conta cc2 = new ContaCorrente(234, 456);

		refs[0] = cc;
		refs[1] = cc2;

		// System.out.println(refs[0]);
		// System.out.println(refs[1]);

		System.out.println(refs.length);

		// System.out.println(refs[2]);

		int quantidade = 0;

		for (int i = 0; i < refs.length; i++) {
			if (refs[i] != null) {
				quantidade += 1;
			}
			System.out.println(refs[i]);
		}

		System.out.println("O tamanho ocupado do array é : " + quantidade);
	}

}
