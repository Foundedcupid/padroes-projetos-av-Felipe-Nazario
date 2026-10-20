public class EmissorAereo extends EmissorPassagem {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemAerea(passageiro, tarifa);
    }
}
