public class Main {
    public static void main(String[] args) {
        calculoMedia();
    }

    private static void calculoMedia() {
        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 9;
        int nota4 = 6;
        int numNotas = 4;

        int media = (nota1 + nota2 + nota3 + nota4)/numNotas;

        System.out.println("A média das notas é: " + media);
    }
}