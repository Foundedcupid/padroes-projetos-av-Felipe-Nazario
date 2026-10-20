public class Main {
    public static void main(String[] args) {
        System.out.println("--- Matrícula Brasil ---");
        new Matricula(new Aluno("Carla Lima", "123.456.789-09"), 1000.00, new FabricaBrasil()).confirmar();

        System.out.println("--- Matrícula Chile ---");
        new Matricula(new Aluno("Camila Rojas", "12.345.678-5"), 1000.00, new FabricaChile()).confirmar();
    }
}
