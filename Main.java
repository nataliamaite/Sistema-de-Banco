public class Main {
    public static void main(String[] args) {
        //Testes
        Conta cc = new ContaCorrente(1234, "Natalia", 19.80, 500);

        OperacaoBancaria op = new Deposito(cc);

        op.executar(200);

        System.out.printf("%.2f", cc.getSaldo());
        
        op.executar(200);
        op.executar(240);

        System.out.println(cc.getSaldo());

        OperacaoBancaria sq = new Saque(cc);

        sq.executar(550);

        System.out.printf("%.2f", cc.getSaldo());

        ContaPoupanca cp = new ContaPoupanca(1345, "Pedro", 1000);
        
        OperacaoBancaria op2 = new Deposito(cp);

        op2.executar(30.00);
        
        cp.renderJuros(0.05);




    }

}
