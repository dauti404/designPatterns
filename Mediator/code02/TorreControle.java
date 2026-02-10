import java.util.ArrayList;
import java.util.List;

public class TorreControle implements Mediator {
    private List<Aviao> avioes = new ArrayList<>();

    public void adicionarAviao(Aviao aviao){ 
        avioes.add(aviao); 
    }

    @Override
    public void enviarMensagem(String mensagem, Aviao aviaoRemetente) {
        for (Aviao a : avioes) {
            // Não envia a mensagem para quem enviou
            if (a != aviaoRemetente) {
                a.receber(mensagem);
            }
        }
    }
}
