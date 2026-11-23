package padroescomportamentais.memento;

public class CandidaturaEstadoContratado implements CandidaturaEstado {

    private CandidaturaEstadoContratado() {};
    private static CandidaturaEstadoContratado instance = new CandidaturaEstadoContratado();
    public static CandidaturaEstadoContratado getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Contratado";
    }

}
