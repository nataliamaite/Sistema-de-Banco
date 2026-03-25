public class Saque implements OperacaoBancaria{

    private Conta conta;

    public Saque(Conta conta) {
        this.conta = conta;
    }

    @Override
    public void executar(double valor){
        conta.sacar(valor);
    }

}
