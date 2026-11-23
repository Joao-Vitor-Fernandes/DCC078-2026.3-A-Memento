package padroescomportamentais.memento;

public class CandidaturaEstadoAprovado implements CandidaturaEstado {

    private CandidaturaEstadoAprovado() {};
    private static CandidaturaEstadoAprovado instance = new CandidaturaEstadoAprovado();
    public static CandidaturaEstadoAprovado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Aprovado";
    }

}
