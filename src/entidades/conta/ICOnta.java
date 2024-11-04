package entidades.conta;

public interface ICOnta {

    
    void sacar(double valor);
    void depositar(double valor);
    void transferir(int contaDestino, double valor);
    void imprimirExtrato();
}