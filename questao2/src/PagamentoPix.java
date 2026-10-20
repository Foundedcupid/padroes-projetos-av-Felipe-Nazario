public class PagamentoPix implements Pagamento {
    public String descrever(double valor) {
        return String.format("Pix de R$ %.2f", valor);
    }
}
