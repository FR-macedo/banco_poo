package entidades.conta;

public class ContaPoupanca extends Conta {

    

    @Override
    public void transferir(int contaDestino, double valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transferir'");
    }

    @Override
    public void imprimirExtrato() {
       System.out.println("Extrato da conta: " + super.saldo);
    }
    
}
