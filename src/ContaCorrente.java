public class ContaCorrente extends Conta{

    private double taxaDeOperacao = 0.10;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor - taxaDeOperacao);
    }

    @Override
    public void sacar(double valor) {
        if (valor + taxaDeOperacao <= getSaldo()) {
            setSaldo(getSaldo() - valor - taxaDeOperacao);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor + taxaDeOperacao <= getSaldo()) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}


