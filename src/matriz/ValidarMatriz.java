package matriz;

public class ValidarMatriz
{
    private boolean diagonalEsquerda(Matriz matriz, char jogador)
    {
        return ((matriz.obterPosicao(0, 0) == matriz.obterPosicao(1, 1))
                && (matriz.obterPosicao(1, 1) == matriz.obterPosicao(2, 2))
                && (matriz.obterPosicao(2, 2) == jogador));
    }

    private boolean diagonalDireita(Matriz matriz, char jogador)
    {
        return (matriz.obterPosicao(2, 0) == matriz.obterPosicao(1, 1)
                && (matriz.obterPosicao(1, 1) == matriz.obterPosicao(0, 2))
                && (matriz.obterPosicao(0, 2) == jogador));
    }

    private boolean linhas(Matriz matriz, char jogador)
    {
        for (int x = 0; x < 3;x++)
        {
            if ((matriz.obterPosicao(x, 0) == matriz.obterPosicao(x, 1))
                && (matriz.obterPosicao(x, 1) == matriz.obterPosicao(x, 2))
                && (matriz.obterPosicao(x, 2) == jogador))
            {
                return true;
            }
        }
        return false;
    }

    private boolean colunas(Matriz matriz, char jogador)
    {
        for (int x = 0; x < 3; x++)
        {
            if ((matriz.obterPosicao(0, x) == matriz.obterPosicao(1, x))
                && (matriz.obterPosicao(1, x) == matriz.obterPosicao(2, x))
                && (matriz.obterPosicao(2, x) == jogador))
            {
                return true;
            }
        }
        return false;
    }

    public boolean validarMatriz(Matriz matriz, char jogador)
    {
        return diagonalEsquerda(matriz, jogador) ||
                diagonalDireita(matriz, jogador) ||
                linhas(matriz, jogador) ||
                colunas(matriz, jogador);
    }

    public boolean empate(byte round)
    {
        return round == 9;
    }
}
