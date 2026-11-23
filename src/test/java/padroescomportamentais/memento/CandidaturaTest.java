package padroescomportamentais.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandidaturaTest {

    @Test
    void deveArmazenarEstados() {
        Candidatura candidatura = new Candidatura();
        candidatura.setEstado(CandidaturaEstadoInscrito.getInstance());
        candidatura.setEstado(CandidaturaEstadoEmTriagem.getInstance());
        candidatura.setEstado(CandidaturaEstadoEmEntrevista.getInstance());
        assertEquals(3, candidatura.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Candidatura candidatura = new Candidatura();
        candidatura.setEstado(CandidaturaEstadoInscrito.getInstance());
        candidatura.setEstado(CandidaturaEstadoReprovado.getInstance());
        candidatura.restauraEstado(0);
        assertEquals(CandidaturaEstadoInscrito.getInstance(), candidatura.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Candidatura candidatura = new Candidatura();
        candidatura.setEstado(CandidaturaEstadoInscrito.getInstance());
        candidatura.setEstado(CandidaturaEstadoEmTriagem.getInstance());
        candidatura.setEstado(CandidaturaEstadoEmEntrevista.getInstance());
        candidatura.setEstado(CandidaturaEstadoReprovado.getInstance());
        candidatura.restauraEstado(2);
        assertEquals(CandidaturaEstadoEmEntrevista.getInstance(), candidatura.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Candidatura candidatura = new Candidatura();
            candidatura.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}
