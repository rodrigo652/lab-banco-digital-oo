public class Main {
    public static void main(String[] args) {

        Conta contaCorrente = new ContaCorrente("Alice", 1000);
        Conta contaPoupanca = new ContaPoupanca("Bob", 2000);

        contaCorrente.depositar(500);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

        contaPoupanca.depositar(500);
        System.out.println("Saldo Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.sacar(200);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());

        contaPoupanca.sacar(200);
        System.out.println("Saldo Conta Poupanca: " + contaPoupanca.getSaldo());

        contaCorrente.transferir(300, contaPoupanca);
        System.out.println("Saldo Conta Corrente: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupanca: " + contaPoupanca.getSaldo());
    }
}