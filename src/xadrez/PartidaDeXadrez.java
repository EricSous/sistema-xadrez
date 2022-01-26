package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

import javax.swing.text.Position;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        configuracaoInicial();
    }

    public PecaDeXadrez[][] pecas(){
        PecaDeXadrez[][] pecaDeXadrez = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i =0; i< tabuleiro.getLinhas(); i++){
            for (int j = 0; j<tabuleiro.getColunas(); j++){
                pecaDeXadrez[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
            }
        }
        return pecaDeXadrez;
    }
        private void configuracaoInicial(){
        tabuleiro.colocarPeca(new Rei(tabuleiro,Color.BRANCO),new Posicao(7,4));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Color.BRANCO),new Posicao(7,7));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Color.BRANCO),new Posicao(7,0));


        tabuleiro.colocarPeca(new Rei(tabuleiro,Color.PRETO),new Posicao(0,4));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Color.PRETO),new Posicao(0,0));
        tabuleiro.colocarPeca(new Torre(tabuleiro,Color.PRETO),new Posicao(0,7));

        }
}
