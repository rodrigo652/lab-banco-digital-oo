public abstract class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Métodos abstratos que serão implementados pelas classes filhas
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);
    public abstract void transferir(double valor, Conta destino);


    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

