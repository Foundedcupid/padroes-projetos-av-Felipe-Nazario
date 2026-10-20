public class NFSe implements DocumentoFiscal {
    public String descrever(double valor) {
        return String.format("NFS-e com ISS de 5%% = R$ %.2f", valor * 0.05);
    }
}
