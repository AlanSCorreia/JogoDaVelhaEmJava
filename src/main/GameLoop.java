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

    private static void gameLoop()
    {
        for (byte round = 0; round <= 9; round++)
        {
            if (validarMatriz.empate(round))
            {
                matriz.desenharMatriz();
                System.out.println("O jogo E M P A T O U !!!");
                break;
            }
            
            matriz.desenharMatriz();
            matriz.atualizarMatriz(jogadores.obterJogadorAtual());

            if (validarMatriz.validarMatriz(matriz, jogadores.obterJogadorAtual()))
            {
                matriz.desenharMatriz();
                System.out.println(jogadores.mostrarGanhador(jogadores.obterJogadorAtual()));
                break;
            }

            jogadores.trocarJogador();
        }
    }
}
