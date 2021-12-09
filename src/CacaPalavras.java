public class CacaPalavras {

    private final short qtLinha = 5;

    private final short qtColuna = 2;

    private String[][] palavras = new String[qtLinha][qtColuna];

    public CacaPalavras() {
        PalavrasEntrada();
    }

    public String[][] PalavrasMatriz() {
        return palavras;
    }

    private void PalavrasEntrada() {
        palavras[0][0] = "IFELSE";
        palavras[1][0] = "FORA";
        palavras[2][0] = "WHILE";
        palavras[3][0] = "OBJETO";
        palavras[4][0] = "VETOR";
    }

    public void Imprimir() {
        for (int i = 0; i < qtLinha; i++) {
            System.out.println(palavras[i][0]);
        }
        System.out.println("----------------");
    }

    public void Respostas() {
        for (int i = 0; i < qtLinha; i++) {
            System.out.println(palavras[i][1] + " - " + palavras[i][0]);
        }
    }
}
