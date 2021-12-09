import java.util.Scanner;

public class CacaMain {

    private static CacaMapa Mapa;
    private static CacaPalavras Palavras;

    // public CacaMain() {
    // Palavras = cacaPalavras;
    // Mapa = mapa;
    // }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        CacaMain main = new CacaMain();
        Palavras = new CacaPalavras();
        Mapa = new CacaMapa();
        Mapa.pesquisa(Palavras.PalavrasMatriz());
        Scanner teclado = new Scanner(System.in);

        main.Menu(teclado);

    }

    public void Menu(Scanner teclado) {

        int opcao = 0;
        do {

            System.out.println("Menu: Caça Palavras");
            System.out.println("Opcao 1-Imprir Palavras");
            System.out.println("Opcao 2-Imprimir Mapa");
            System.out.println("Opcao 3- Repostas");
            System.out.println("Opcao 4 -Sair");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    Palavras.Imprimir();
                    break;
                case 2:
                    Mapa.Imprimir();
                    break;
                case 3:
                    Palavras.Respostas();
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
