package application;

import xadrez.PecaDeXadrez;

public class UI {

    public static void printTabuleiro(PecaDeXadrez[][] pecaDeXadrez){
        for(int i =0; i< pecaDeXadrez.length; i++){
            System.out.print((8-i)+ " ");
            for (int j= 0; j<pecaDeXadrez.length; j++){
                printPeca(pecaDeXadrez[i][j]);

            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printPeca(PecaDeXadrez pecaDeXadrez){
        if(pecaDeXadrez == null){
            System.out.print("-");
        }else{
            System.out.print(pecaDeXadrez);
        }
        System.out.print(" ");
    }
}
