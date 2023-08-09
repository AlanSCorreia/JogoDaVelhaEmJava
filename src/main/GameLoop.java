package main;

import jogadores.Jogadores;
import matriz.Matriz;
import matriz.ValidarMatriz;

public class GameLoop
{
    private static final Jogadores jogadores = new Jogadores();
    private static final Matriz matriz = new Matriz();
    private static final ValidarMatriz validarMatriz = new ValidarMatriz();

    public GameLoop() {
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
