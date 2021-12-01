import java.util.Scanner;

public class CacaMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    private CacaMapa mapa;
    private CacaPalavras palavras;

    public CacaMain(Scanner teclado) {

        int opcao = 0;
        do {

            System.out.println("Menu: Caça Palavras");
            System.out.println("Opcao 1");
            System.out.println("Opcao 2");
            System.out.println("Opcao 3");
            System.out.println("Opcao 4");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:
                    System.out.println("Opção errada");
                    break;
            }
        } while (opcao != 4);
    }
}
