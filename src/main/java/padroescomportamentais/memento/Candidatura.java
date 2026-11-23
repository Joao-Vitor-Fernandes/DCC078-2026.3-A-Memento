package padroescomportamentais.memento;

import java.util.ArrayList;
import java.util.List;

public class Candidatura {

    private CandidaturaEstado estado;
    private List<CandidaturaEstado> memento = new ArrayList<CandidaturaEstado>();

    public CandidaturaEstado getEstado() {
        return this.estado;
    }

    public void setEstado(CandidaturaEstado estado) {
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public void restauraEstado(int indice) {
        if (indice < 0 || indice > this.memento.size() - 1) {
            throw new IllegalArgumentException("Índice inválido");
        }
        this.estado = this.memento.get(indice);
    }

    public List<CandidaturaEstado> getEstados() {
        return this.memento;
    }
}