package conta.repository;

public class conta {
    private int numero;
    private float saldo;
    
    public conta(int numero, float saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public int getNumero() {
        return numero;
    }
    
    public float getSaldo() {
        return saldo;
    }
    
    public void sacar(float valor) {
        saldo -= valor;
    }
    
    public void depositar(float valor) {
        saldo += valor;
    }
    
    public void transferir(conta destino, float valor) {
        sacar(valor);
        destino.depositar(valor);
    }
}