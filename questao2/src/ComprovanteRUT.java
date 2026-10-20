public class ComprovanteRUT implements Comprovante {
    public String descrever(Aluno aluno) {
        return "Aluno " + aluno.getNome() + " - RUT: " + aluno.getDocumento();
    }
}
