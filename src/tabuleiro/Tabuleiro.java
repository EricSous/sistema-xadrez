package tabuleiro;

public class Tabuleiro {

    private int fileira;
    private int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int fileira, int colunas) {
        this.fileira = fileira;
        this.colunas = colunas;
        pecas = new Peca[fileira][colunas];

    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }


}
