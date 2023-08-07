package matriz;

import jogadores.Jogadores;

public class Matriz
{
    private static final Jogadores jogadores = new Jogadores();
    private final char[][] matriz = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public char[][] getMatriz()
    {
        return matriz;
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

    public void setMatriz(char letra)
    {
        do {
            byte[] posDaJogada = jogadores.setElemento();

            if (matriz[posDaJogada[0] - 1][posDaJogada[1] - 1] == ' ')
            {
                matriz[posDaJogada[0] - 1][posDaJogada[1] - 1] = letra;
                break;
            }

            else
            {
                System.out.println("POSIÇÃO INVÁLIDA. Tente novamente.");
            }
        } while (true);
    }
}
