public abstract class EmissorPassagem {

    // Factory Method: cada emissor decide qual passagem criar
    protected abstract Passagem criarPassagem(String passageiro, double tarifa);

    // Procedimento único de emissão (não conhece classes concretas)
    public final void emitir(String passageiro, double tarifa) {
        Passagem passagem = criarPassagem(passageiro, tarifa);
        double taxa = passagem.calcularTaxaEmbarque();

        System.out.println("Modal: " + passagem.getModal());
        System.out.println("Passageiro: " + passagem.getPassageiro());
        System.out.printf("Taxa de embarque: R$ %.2f%n", taxa);
        System.out.println("Documentos: " + passagem.getDocumentos());
        System.out.println();
    }
}
