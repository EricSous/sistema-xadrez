package tabuleiro;

public class Tabuleiro {

    private int linhas;
    private int colunas;
    private Peca[][] peca;

    public Tabuleiro(int linhas, int colunas) {
        if(linhas<1 || colunas <1) {
            throw new TabuleiroException("Erro ao criar tabuleiro muito curto");
        }
        this.linhas = linhas;
        this.colunas = colunas;
        peca = new Peca[linhas][colunas];

    }

    public int getLinhas() {
        return linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public Peca peca(int linhas, int colunas){
        if(!posicaoExiste(linhas, colunas)) {
            throw new TabuleiroException("Posição nao esta no tabuleiro");
        }
        return peca[linhas][colunas];
    }
    public Peca peca(Posicao posicao){
        if(!posicaoExiste(posicao)) {
            throw new TabuleiroException("Posição nao esta no tabuleiro");
        }
        return peca[posicao.getLinhas()][posicao.getColuna()];
    }

    public void colocarPeca(Peca peca, Posicao posicao){
        if(possuiUmaPeca(posicao)){
            throw new TabuleiroException("Ja possui uma peça nesta posição " + posicao);
        }
        this.peca[posicao.getLinhas()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    public Boolean posicaoExiste(int linhas, int colunas){
        return linhas>=0 && linhas < this.linhas && colunas>=0 && colunas < this.colunas;

    }

    public Boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinhas(), posicao.getColuna());

    }

    public Boolean possuiUmaPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroException("Posição inexistente no tabuleiro ");
        }
        return peca(posicao) != null;
    }
}
