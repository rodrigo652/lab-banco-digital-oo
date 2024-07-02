public class ContaPoupanca extends Conta{

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, Conta destino) {
        if (valor <= getSaldo()) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
