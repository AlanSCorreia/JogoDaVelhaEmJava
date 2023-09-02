package matriz;

import jogadores.Jogadores;

public class Matriz
{
    private static final Jogadores jogadores = new Jogadores();
    private char[][] matriz = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public char[][] obterMatriz()
    {
        return matriz;
    }

     public char obterPosicao(int linha, int coluna)
    {
        return matriz[linha][coluna];
    }

    public void desenharMatriz()
    {
        System.out.println("\n||=||=||=||");
        for (char[] linha: matriz)
        {
            for (char coluna: linha)
            {
                System.out.print("||" + coluna);
            }
            System.out.print("||\n");
        }
        System.out.println("||=||=||=||\n");
    }

    public void atualizarMatriz(char jogador)
    {
        do {
            byte[] posDaJogada = jogadores.receberElemento();

            if (matriz[posDaJogada[0] - 1][posDaJogada[1] - 1] == ' ')
            {
                matriz[posDaJogada[0] - 1][posDaJogada[1] - 1] = jogador;
                break;
            }

            else
            {
                System.out.println("POSIÇÃO INVÁLIDA. Tente novamente.");
            }
        } while (true);
    }
}
