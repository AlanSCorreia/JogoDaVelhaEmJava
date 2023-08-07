package main;

import jogadores.Jogadores;
import matriz.*;

public class Main {
    public static Jogadores jogadores = new Jogadores();
    public static Matriz matriz = new Matriz();
    public static ValidarMatriz validarMatriz = new ValidarMatriz();


    public static void main(String[] args) {
        gameLoop();
    }

    public static void ganhador(char letra)
    {
        switch (letra)
        {
            case 'X' -> System.out.println("O jogador 1 Venceu!!!!!!!");
            case 'O' -> System.out.println("O jogador 2 Venceu!!!!!!!");
        }
    }

    public static void gameLoop()
    {
        for (byte round = 0; round <= 9; round++)
        {
            if (round == 9)
            {
                matriz.desenharMatriz();
                System.out.println("EMPATE.");
            }

            else
            {
                char jogadorDaVez = jogadores.getJogadorAtual();
                jogadores.setJogador();
                matriz.desenharMatriz();
                matriz.setMatriz(jogadorDaVez);

                if (validarMatriz.Validar(matriz.getMatriz(), jogadorDaVez))
                {

                    matriz.desenharMatriz();
                    ganhador(jogadorDaVez);
                    break;
                }
            }
        }
    }
}

/*
* rodar num for loop de 9 rodadas, caso ninguem ganhe antes do final das rodadas é empate
* não permmitir a mudança de valores nas celulas
*
*
* */