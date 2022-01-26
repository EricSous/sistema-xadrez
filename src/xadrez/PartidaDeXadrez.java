package xadrez;

import tabuleiro.Tabuleiro;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
    }

    public PecaDeXadrez[][] pecas(){
        PecaDeXadrez[][] pecaDeXadrez = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i =0; i< tabuleiro.getLinhas(); i++){
            for (int j = 0; j<tabuleiro.getColunas(); j++){
                pecaDeXadrez[i][j] = (PecaDeXadrez) tabuleiro.peca(i,j);
            }
        }
        return pecaDeXadrez;
    }

}
