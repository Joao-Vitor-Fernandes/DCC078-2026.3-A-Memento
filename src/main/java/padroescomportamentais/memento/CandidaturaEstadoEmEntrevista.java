package padroescomportamentais.memento;

public class CandidaturaEstadoEmEntrevista implements CandidaturaEstado {

    private CandidaturaEstadoEmEntrevista() {};
    private static CandidaturaEstadoEmEntrevista instance = new CandidaturaEstadoEmEntrevista();
    public static CandidaturaEstadoEmEntrevista getInstance() {
        return instance;
    }

    public String getNomeEstado() {
        return "Em Entrevista";
    }

}
