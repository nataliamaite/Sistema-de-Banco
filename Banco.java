import java.util.ArrayList;

public class Banco {

    ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public ArrayList<Conta> listarContas(){
        return contas;
    }

    public void buscarConta(int numero){
        for (Conta conta : contas){
            if(conta.equals(numero)){
                System.out.println(conta);
        }else{
            System.out.println("Conta não encontrada!");
        }
    }

}
}
