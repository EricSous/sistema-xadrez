package tabuleiro;

public class Posicao {
    private int linhas;
    private int coluna;

    public Posicao(int linhas, int coluna) {
        this.linhas = linhas;
        this.coluna = coluna;
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
    @Override
    public String toString(){
        return linhas + ", " + coluna;
    }
}
