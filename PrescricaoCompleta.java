import java.util.ArrayList;
import java.util.Arrays;

public class PrescricaoCompleta {
    ArrayList<PrescricaoRemedio> prescricao;

    public PrescricaoCompleta() {
        this.prescricao = new ArrayList<PrescricaoRemedio>();
    }

    public void adicionar(PrescricaoRemedio novaPrescricao) {
        this.prescricao.add(novaPrescricao);
    }

    public ArrayList<PrescricaoRemedio> getPrescricaoCompleta() {
        return this.prescricao;
    }

    public PrescricaoRemedio obter(int posicao) {
        return this.prescricao.get(posicao);
    }
    
    /*
    public PrescricaoRemedio obter(PrescricaoRemedio prescricaoRemedio) {
        return this.prescricao.get(prescricaoRemedio);
    }*/

    public void remover(int posicao) {
        this.prescricao.remove(posicao);
    }

    public void remover(PrescricaoRemedio prescricaoRemedio) {
        this.prescricao.remove(prescricaoRemedio);
    }
}