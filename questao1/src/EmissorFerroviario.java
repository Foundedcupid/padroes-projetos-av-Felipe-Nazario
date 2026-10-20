public class EmissorFerroviario extends EmissorPassagem {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemFerroviaria(passageiro, tarifa);
    }
}
