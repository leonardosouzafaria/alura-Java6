package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception { //checked
	
	public SaldoInsuficienteException(String mensagem) {
		super(mensagem);
	}
}
