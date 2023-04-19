package conta.controller;

import conta.repository.conta;

public class ContaController {
    private conta[] contas;
    
    public ContaController(int numContas) {
        contas = new conta[numContas];
    }
    
    // método para adicionar contas
    public void adicionarConta(int indice, conta conta) {
        contas[indice] = conta;
    }
    
    // método para sacar
    public void sacar(int numero, float valor) {
        conta conta = encontrarConta(numero);
        if (conta != null) {
            conta.sacar(valor);
        }
    }
    
    // método para depositar
    public void depositar(int numero, float valor) {
        conta conta = encontrarConta(numero);
        if (conta != null) {
            conta.depositar(valor);
        }
    }
    
    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
        conta contaOrigem = encontrarConta(numeroOrigem);
        conta contaDestino = encontrarConta(numeroDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor);
        }
    }
    

    private conta encontrarConta(int numero) {
        for (conta conta : contas) {
            if (conta != null && conta.getNumero() == numero) {
                return conta;
            }
        }
        System.out.println("Conta não encontrada.");
        return null;
    }
}
