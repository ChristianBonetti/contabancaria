package conta.controller;

import java.util.ArrayList;
import java.util.List;

import conta.repository.*;

public class ContaController {
    
    private List<conta> contas;
    
    public ContaController() {
        contas = new ArrayList<>();
    }
    
    public conta procurarPorNumero(int numero) {
        for (conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
    
    public List<conta> listarTodas() {
        return contas;
    }
    
    public void cadastrar(conta conta) {
        contas.add(conta);
    }
    
    public void atualizar(conta contaAtualizada) {
        for (int i = 0; i < contas.size(); i++) {
            conta conta = contas.get(i);
            if (conta.getNumero() == contaAtualizada.getNumero()) {
                contas.set(i, contaAtualizada);
                break;
            }
        }
    }
    
    public void deletar(int numero) {
        for (int i = 0; i < contas.size(); i++) {
            conta conta = contas.get(i);
            if (conta.getNumero() == numero) {
                contas.remove(i);
                break;
            }
        }
    }
}
