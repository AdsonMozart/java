package excessao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            new Exception();
        }

        System.out.println("Fim :)");
    }

    // Não checada ou não verificada
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal! #01");
    }
    static void geraErro2() {
        new Exception("Ocorreu um erro bem legal! #02");
    }
}
