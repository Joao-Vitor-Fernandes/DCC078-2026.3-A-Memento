package padroescomportamentais.memento;

public class CandidaturaEstadoReprovado implements CandidaturaEstado {

    private CandidaturaEstadoReprovado() {};
    private static CandidaturaEstadoReprovado instance = new CandidaturaEstadoReprovado();
    public static CandidaturaEstadoReprovado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Reprovado";
    }

}
