import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        Map<String , Integer> quatidadeAlunosCidade = new HashMap<>();
        quatidadeAlunosCidade.put("Fortaleza", 3);        
        quatidadeAlunosCidade.put("Porto Alegre", 3);        
        quatidadeAlunosCidade.put("Taua", 1);        
        quatidadeAlunosCidade.put("Cuiaba", 1);        
        
        for (String chave : quatidadeAlunosCidade.keySet()) {
            System.out.println("Chave = " + chave + " Valor = " + quatidadeAlunosCidade.get(chave));
        }
    }
}
