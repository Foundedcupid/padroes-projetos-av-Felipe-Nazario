public class EmissorRodoviario extends EmissorPassagem {
    protected Passagem criarPassagem(String passageiro, double tarifa) {
        return new PassagemRodoviaria(passageiro, tarifa);
    }
}
