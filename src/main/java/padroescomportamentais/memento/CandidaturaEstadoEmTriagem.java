package padroescomportamentais.memento;

public class CandidaturaEstadoEmTriagem implements CandidaturaEstado {

    private CandidaturaEstadoEmTriagem() {};
    private static CandidaturaEstadoEmTriagem instance = new CandidaturaEstadoEmTriagem();
    public static CandidaturaEstadoEmTriagem getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Triagem";
    }

}