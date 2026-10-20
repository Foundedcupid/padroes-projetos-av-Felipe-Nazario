public class Aluno {
    private String nome;
    private String documento; // CPF ou RUT

    public Aluno(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() { return nome; }
    public String getDocumento() { return documento; }
}
