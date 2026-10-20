public class PagamentoWebpay implements Pagamento {
    public String descrever(double valor) {
        return String.format("Webpay de %.2f", valor);
    }
}
