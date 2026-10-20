public class FabricaBrasil implements FabricaPais {
    public DocumentoFiscal criarDocumentoFiscal() { return new NFSe(); }
    public Pagamento criarPagamento() { return new PagamentoPix(); }
    public Comprovante criarComprovante() { return new ComprovanteCPF(); }
}
