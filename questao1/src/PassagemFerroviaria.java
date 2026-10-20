public class PassagemFerroviaria implements Passagem {
    private String passageiro;
    private double tarifa;

    public PassagemFerroviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() { return "Ferroviário"; }
    public String getPassageiro() { return passageiro; }
    public double calcularTaxaEmbarque() { return tarifa * 0.05; }
    public String getDocumentos() { return "Documento de identidade com foto, comprovante de reserva"; }
}
