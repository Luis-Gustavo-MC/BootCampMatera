import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente = new ContaCorrente(50.00);
        ContaPoupanca poupanca = new ContaPoupanca(150.00);
        
        List<Conta> list = new ArrayList<>();
        list.add(corrente);
        list.add(poupanca);
        
        for (Conta conta : list) {
            System.out.println(conta.getExtrato());
        }

    }
}
