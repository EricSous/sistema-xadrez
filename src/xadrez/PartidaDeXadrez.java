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

    private void trocaPeca(char coluna, int linha, PecaDeXadrez peca){
        tabuleiro.colocarPeca(peca,new XadrezPosicao(coluna,linha).paraPosicao());
    }
        private void configuracaoInicial(){
        trocaPeca('e', 1, new Rei(tabuleiro,Color.BRANCO));
        trocaPeca('a', 1, new Torre(tabuleiro,Color.BRANCO));
        trocaPeca('h', 1, new Torre(tabuleiro,Color.BRANCO));


        trocaPeca('e', 8, new Rei(tabuleiro,Color.PRETO));
        trocaPeca('a', 8, new Torre(tabuleiro,Color.PRETO));
        trocaPeca('h', 8, new Torre(tabuleiro,Color.PRETO));

        }
}
