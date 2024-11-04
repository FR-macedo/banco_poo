package entidades.conta;

public abstract class Conta implements ICOnta{
    
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public Conta(){
        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    protected int agencia;
    protected int conta;
    protected double saldo;
    
    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
}
