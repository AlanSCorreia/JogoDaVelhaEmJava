package jogadores;

import java.util.Scanner;

public class Jogadores
{
    private char jogadorAtual = 'X';

    public char getJogadorAtual()
    {
        return jogadorAtual;
    }

    public byte[] setElemento()
    {
        byte linha;
        byte coluna;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Escolha uma linha entre [ 1 / 2 / 3]: ");
            linha = scanner.nextByte();

            if (!(linha <= 3))
            {
                System.out.println("ESCOLHA INVÁLIDA. Tente novamente!");
            }
        } while (!(linha <= 3));

        do {
            System.out.print("Escolha uma coluna entre [ 1 / 2 / 3]: ");
            coluna = scanner.nextByte();

            if (!(coluna <= 3))
            {
                System.out.println("ESCOLHA INVÁLIDA. Tente novamente!");
            }
        } while (!(coluna <= 3));

        return new byte[]{linha, coluna};
    }

    public void setJogador()
    {
        switch (jogadorAtual)
        {
            case 'X' -> jogadorAtual = 'O';
            case 'O' -> jogadorAtual = 'X';
        }
    }
}
