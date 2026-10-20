public class Matricula {
    private Aluno aluno;
    private double valor;
    private FabricaPais fabrica;

    public Matricula(Aluno aluno, double valor, FabricaPais fabrica) {
        this.aluno = aluno;
        this.valor = valor;
        this.fabrica = fabrica;
    }

    public void confirmar() {
        DocumentoFiscal documento = fabrica.criarDocumentoFiscal();
        Pagamento pagamento = fabrica.criarPagamento();
        Comprovante comprovante = fabrica.criarComprovante();

        System.out.println("Documento fiscal: " + documento.descrever(valor));
        System.out.println("Pagamento: " + pagamento.descrever(valor));
        System.out.println("Comprovante: " + comprovante.descrever(aluno));
        System.out.println();
    }
}
