public class CacaMapa {

    private final short qtLinha = 10;
    private final short qtdColuna = 5;
    private char[][] mapa = new char[qtLinha][qtdColuna];

    public CacaMapa() {
        MapaEntrada();
    }

    private void MapaLinha() {
        System.out.println("-------------------");
    }

    public void Imprimir() {
        MapaLinha();
        for (int linha = 0; linha < qtLinha; linha++) {
            for (int coluna = 0; coluna < qtdColuna; coluna++) {
                System.out.println("| " + mapa[linha][coluna] + " | ");
            }
        }
    }

    public void pesquisa(String[][] palavras) {
        int colunavetor = 0, linhavetor = 0;
        for (int plvr = 0; plvr < palavras.length; plvr++) {
            int esquerdaDireita = 0, cimaBaixo = 0, direitaEsquerda = 0, baixoCima = 0;
            if (palavras[plvr][1] == null) {
                // CimaBaixo
                for (int col = 0; col < qtdColuna; col++) {
                    for (int lin = 0; lin < qtLinha; lin++) {
                        if (palavras[plvr][0].charAt(cimaBaixo) == mapa[lin][col]) {// ver se a letra da palavra é igual
                                                                                    // do mapa
                            cimaBaixo++;
                            if (cimaBaixo == 1) { // guarda lin e caso achar
                                linhavetor = lin;
                                colunavetor = col;
                            }
                            if (cimaBaixo == palavras[plvr][0].length()) {// se QTD de de foir igual ao tamanho da
                                                                          // palavra/ achou palavra
                                palavras[plvr][1] = "[" + linhavetor + "," + colunavetor + "]";
                                col = qtdColuna; // sai do for coluna
                                break; // sai do for linha
                            }
                        } else {
                            cimaBaixo = 0;
                        }
                    }
                }
            }

            if (palavras[plvr][1] == null) {

                for (int lin = 0; lin < qtLinha; lin++) {
                    for (int col = qtdColuna - 1; col >= 0; col--) {
                        if (palavras[plvr][0].charAt(direitaEsquerda) == mapa[lin][col]) {
                            direitaEsquerda++;
                            if (direitaEsquerda == 1) {
                                linhavetor = lin;
                                colunavetor = col;
                            }
                            if (direitaEsquerda == palavras[plvr][0].length()) {
                                palavras[plvr][1] = "[" + linhavetor + "," + colunavetor + "]";
                                lin = qtLinha;
                                break;
                            }
                        } else {
                            direitaEsquerda = 0;
                        }
                    }
                }
            }

            if (palavras[plvr][1] == null) {

                for (int lin = 0; lin < qtLinha; lin++) {
                    for (int col = 0; col < qtdColuna; col++) {
                        if (palavras[plvr][0].charAt(esquerdaDireita) == mapa[lin][col]) {

                            esquerdaDireita++;
                            if (esquerdaDireita == 1) {
                                linhavetor = lin;
                                colunavetor = col;
                            }
                            if (esquerdaDireita == palavras[plvr][0].length()) {
                                palavras[plvr][1] = "[" + linhavetor + "," + colunavetor + "]";
                                lin = qtLinha;
                                break;
                            }
                        } else {
                            esquerdaDireita = 0;
                        }
                    }
                }
            }

            if (palavras[plvr][1] == null) {
                for (int col = 0; col < qtdColuna; col++) {
                    for (int lin = qtLinha - 1; lin >= 0; lin--) {
                        if (palavras[plvr][0].charAt(baixoCima) == mapa[lin][col]) {

                            baixoCima++;
                            if (baixoCima == 1) {
                                linhavetor = lin;
                                colunavetor = col;
                            }
                            if (baixoCima == palavras[plvr][0].length()) {

                                palavras[plvr][1] = "[" + linhavetor + "," + colunavetor + "]";
                                col = qtdColuna;
                                break;
                            }
                        } else {
                            baixoCima = 0;
                        }
                    }
                }
            }

            if (palavras[plvr][1] == null) {
                palavras[plvr][1] = "....NÃO achou";
            }
        }
    }

    public void MapaEntrada() {
        mapa[0][0] = 'C';
        mapa[0][1] = 'C';
        mapa[0][2] = 'Q';
        mapa[0][3] = 'W';
        mapa[0][4] = 'E';
        mapa[1][0] = 'I';
        mapa[1][1] = 'X';
        mapa[1][2] = 'F';
        mapa[1][3] = 'O';
        mapa[1][4] = 'R';
        mapa[2][0] = 'F';
        mapa[2][1] = 'F';
        mapa[2][2] = 'R';
        mapa[2][3] = 'G';
        mapa[2][4] = 'F';
        mapa[3][0] = 'E';
        mapa[3][1] = 'L';
        mapa[3][2] = 'I';
        mapa[3][3] = 'H';
        mapa[3][4] = 'W';
        mapa[4][0] = 'L';
        mapa[4][1] = 'S';
        mapa[4][2] = 'F';
        mapa[4][3] = 'O';
        mapa[4][4] = 'U';
        mapa[5][0] = 'S';
        mapa[5][1] = 'D';
        mapa[5][2] = 'G';
        mapa[5][3] = 'T';
        mapa[5][4] = 'S';
        mapa[6][0] = 'E';
        mapa[6][1] = 'J';
        mapa[6][2] = 'H';
        mapa[6][3] = 'E';
        mapa[6][4] = 'T';
        mapa[7][0] = 'I';
        mapa[7][1] = 'I';
        mapa[7][2] = 'I';
        mapa[7][3] = 'J';
        mapa[7][4] = 'M';
        mapa[8][0] = 'X';
        mapa[8][1] = 'C';
        mapa[8][2] = 'K';
        mapa[8][3] = 'B';
        mapa[8][4] = 'G';
        mapa[9][0] = 'V';
        mapa[9][1] = 'E';
        mapa[9][2] = 'T';
        mapa[9][3] = 'O';
        mapa[9][4] = 'R';
    }
}
