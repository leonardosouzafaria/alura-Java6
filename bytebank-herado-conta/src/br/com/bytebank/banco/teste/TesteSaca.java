package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSaca {
	
	public static void main(String[] args) {
		
		Conta conta = new ContaCorrente(123,123);	
		
		conta.deposita(200);
		
		try	{
			conta.saca(200);
		} catch(Exception exception) {
			System.out.println(exception.getMessage());
			exception.printStackTrace();
			//Alteracao teste
		}
		
		System.out.println(conta.getSaldo());
	}
	
}
