public class PassagemAerea implements Passagem {
    private String passageiro;
    private double tarifa;

    public PassagemAerea(String passageiro, double tarifa) {
        this.passageiro = passageiro;
        this.tarifa = tarifa;
    }

    public String getModal() { return "Aéreo"; }
    public String getPassageiro() { return passageiro; }
    public double calcularTaxaEmbarque() { return tarifa * 0.08; }
    public String getDocumentos() { return "Documento de identidade com foto, bilhete eletrônico (e-ticket)"; }
}
