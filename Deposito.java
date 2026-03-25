public class Deposito implements OperacaoBancaria{

    private Conta conta;//deposito precisa agir sobre uma conta

    public Deposito(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void executar(double valor) {
        conta.depositar(valor);
    }
}
