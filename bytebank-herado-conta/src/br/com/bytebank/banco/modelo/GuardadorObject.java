package br.com.bytebank.banco.modelo;

public class GuardadorObject {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	//Construtor
	public GuardadorObject() {
		this.referencias = new GuardadorObject[10];
	}
	
	public void adiciona(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
	}
	
	public int getQuantidadeElemento() {
		return this.posicaoLivre;
	}
}
