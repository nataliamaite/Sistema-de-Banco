public class ContaCorrente extends Conta{

    protected double limite;

    
    public ContaCorrente(int numero, String titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }


    public void sacar(double valor){
        if(valor <= limite){
            saldo = saldo - valor;
        }else{
            System.out.println("Saque bloqueado!");
        }
    }
}
