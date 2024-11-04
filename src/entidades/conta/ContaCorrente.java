package entidades.conta;

public class ContaCorrente extends Conta{

    @Override
    public void transferir(int contaDestino, double valor) {
       
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("Extrato da conta: " + super.saldo);
    }
    
}
