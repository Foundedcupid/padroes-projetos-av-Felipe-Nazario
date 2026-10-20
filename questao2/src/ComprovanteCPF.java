public class ComprovanteCPF implements Comprovante {
    public String descrever(Aluno aluno) {
        return "Aluno " + aluno.getNome() + " - CPF: " + aluno.getDocumento();
    }
}
