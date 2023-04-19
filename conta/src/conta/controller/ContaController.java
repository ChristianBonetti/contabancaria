package conta.controller;

import java.util.ArrayList;

import conta.Menu;
import conta.repository.conta;

public class contacontroller implements conta.repository {

	private ArrayList<conta> listaContas = new ArrayList<conta>();
	int numero = 0;

	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null)
			conta.visualizar();
		else
			System.out.println("\nA Conta número: " + numero + "não foi encontada! ");

	}

	private Object buscarNaCollection(int numero2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}

	}

	public void cadastrar(conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso");
	}

	public void atualizar(conta conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());

		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("\nA Conta numero: " + conta.getNumero() + "foi atulizada com sucesso ");
		} else
			System.out.println("\nA Conta numero: " + conta.getNumero() + " não foi encontrada! ");

	}

	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			if (listaContas.remove(conta) == true)
				System.out.println("\nA conta numero: " + numero + " foi deletada com sucesso");
		} else
			System.out.println("\nA conta numero :" + numero + "não foi encontrada");
	}

	public void sacar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {

			if (conta.sacar(valor) == true)
				System.out.println("\nO saque na conta numero: " + numero + " foi efetudo com sucesso!");
		} else
			System.out.println("\nA conta numero: " + numero + " não foi encontrada");

	}

	public void depositar(int numero, float valor) {
		var conta = buscarNaCollection(numero);

		if (conta != null) {
			conta.depositar(valor);
			System.out.println("\nO deposito na conta numero: " + numero + "foi efetudo! ");
		} else
			System.out.println(
					"\nA Conta numero: " + numero + " não foi encontrada ou a conta destino não é uma conta corrente");

	}

	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		var contaOrigem = buscarNaCollection(numeroOrigem);
		var contaDestino = buscarNaCollection(numeroDestino);

		if (contaOrigem.sacar(valor) == true) {
			contaDestino.depositar(valor);
			System.out.println("\nA transferência foi efetuada com sucesso!");
		} else 
			System.out.println("\nA conta de origem e/ou Destino não foram encontradas!");
	} 
	

	public int gerarNumero() {
		return ++numero;
	}

	public conta buscarNaCollection1(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta;

			}
		}
		return null;
	}

	public int retornaTipo(int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();

			}
		}
		return 0;
	}
}
