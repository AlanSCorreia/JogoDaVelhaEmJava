package matriz;

public class ValidarMatriz
{
    public boolean diagonalDireita(char[][] matriz, char letra)
    {
        return ((matriz[0][0] == matriz[1][1]) && (matriz[1][1] == matriz[2][2]) && (matriz[2][2] == letra));
    }

    public boolean diagonalEsquerda(char[][] matriz, char letra)
    {
        return ((matriz[2][0] == matriz[1][1]) && (matriz[1][1] == matriz[0][2]) && (matriz[0][2] == letra));
    }

    public boolean linhasEColunas(char[][] matriz, char letra)
    {
        for (int x = 0; x < 3; x++)
        {
            if (((matriz[x][0] == matriz[x][1]) && (matriz[x][1] == matriz[x][2]) && (matriz[x][2] == letra)) |
                    ((matriz[0][x] == matriz[1][x]) && (matriz[1][x] == matriz[2][x]) && (matriz[2][x] == letra)))
            {
                return true;
            }
        }

        return false;
    }

    public boolean Validar(char[][] matriz, char letra)
    {
        return diagonalDireita(matriz, letra) || diagonalEsquerda(matriz, letra) || linhasEColunas(matriz, letra);
    }
}
