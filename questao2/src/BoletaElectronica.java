public class BoletaElectronica implements DocumentoFiscal {
    public String descrever(double valor) {
        return String.format("Boleta electrónica com IVA de 19%% = %.2f", valor * 0.19);
    }
}
