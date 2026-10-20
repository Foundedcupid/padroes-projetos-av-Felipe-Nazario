public class PassagemRodoviaria implements Passagem {
    private String passageiro;
    private double tarifa;

    public PassagemRodoviaria(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() { return "Rodoviário"; }
    public String getPassageiro() { return passageiro; }
    public double calcularTaxaEmbarque() { return tarifa * 0.03; }
    public String getDocumentos() { return "Documento de identidade com foto"; }
}
