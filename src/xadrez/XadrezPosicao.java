package xadrez;

import tabuleiro.Posicao;

public class XadrezPosicao {

    private int linhas;
    private char colunas;

    public XadrezPosicao(char colunas, int linhas) {
        if(colunas < 'a' || colunas > 'h'|| linhas< 1 || linhas>8){
            throw new XadrezException("Erro ao instanciar linhas e colunas valores permitidos de a até h e de 0 a 8.");
        }
        this.colunas = colunas;
        this.linhas = linhas;
    }

    public int getLinhas() {
        return linhas;
    }

    public char getColunas() {
        return colunas;
    }

    protected Posicao paraPosicao(){
        return new Posicao(8 - linhas, colunas - 'a');

    }

    protected static XadrezPosicao xadrezPosicao(Posicao posicao){
        return new XadrezPosicao((char)('a' - posicao.getColuna()),8 - posicao.getLinhas());
    }

    @Override
    public String toString() {
        return "" + colunas + linhas  ;
    }
}
