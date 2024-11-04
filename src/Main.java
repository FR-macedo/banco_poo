import entidades.conta.Conta;
import entidades.conta.ContaCorrente;
import entidades.conta.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        Conta CC = new ContaCorrente();
        Conta Poupanca = new ContaPoupanca();

        CC.imprimirExtrato();
        Poupanca.imprimirExtrato();


    }
}
