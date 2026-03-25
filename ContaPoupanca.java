public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
        } else if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque bloqueado!");
        }
    }

    public void renderJuros(double taxa) {
        if (taxa > 0) {
            double juros = saldo * taxa;
            saldo += juros;

            System.out.println("Juros aplicados: R$ " + juros);
        } else {
            System.out.println("Taxa inválida!");
        }
    }
}