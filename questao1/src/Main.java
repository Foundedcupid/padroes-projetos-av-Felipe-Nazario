public class Main {
    public static void main(String[] args) {
        new EmissorAereo().emitir("Maria Silva", 1000.00);
        new EmissorRodoviario().emitir("João Souza", 200.00);
        new EmissorFerroviario().emitir("Ana Costa", 500.00);
    }
}
