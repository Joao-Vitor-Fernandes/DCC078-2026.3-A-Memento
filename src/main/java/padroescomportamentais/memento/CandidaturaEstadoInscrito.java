package padroescomportamentais.memento;

public class CandidaturaEstadoInscrito implements CandidaturaEstado {

    private CandidaturaEstadoInscrito() {};
    private static CandidaturaEstadoInscrito instance = new CandidaturaEstadoInscrito();
    public static CandidaturaEstadoInscrito getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Inscrito";
    }

}
