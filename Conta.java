public abstract class Conta {

    protected int numero;
    protected String titular;
    protected double saldo;

    

    public Conta(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public abstract void sacar(double valor);

    public double getSaldo(){
        return saldo;
    }

}
