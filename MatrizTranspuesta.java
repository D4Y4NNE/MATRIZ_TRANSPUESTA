package TranspuestadeunaMatriz.java;

public class MatrizTranspuesta
{
    public int[][] matrizA;
    public int[][]matrizT;
    public int f;
    public int c;

    public MatrizTranspuesta(int filas, int columnas)
    {
        this.setFilas(filas);
        this.setColumnas(columnas);
    }
     public void setFilas(int filas)
     {
         this.setFilas(filas);
     }
     public int getFilas()
    {
        return getFilas();
    }

    public void setColumnas(int columnas)
    {
        this.setColumnas(columnas);
    }
    public int getColumnas()
    {
        return getColumnas();
    }

    public void mostrarMatrizTranspuesta()
    {
        matrizA = new int[getFilas()][getColumnas()];
        for (f=0; f<getFilas(); f++)
        {
            for(c=0; c<getColumnas(); c++)
            {
                matrizA[f][c] = (int)(Math.random()*(10-1)+1);
            }
        }
        for(f=0; f<getFilas(); f++)
        {
            for(c=0; c<getColumnas();c++)
            {
                System.out.println(matrizA[f][c]);
            }
        }
    }
    public void transpuestaMatriz()
    {
        matrizT = new int[getFilas()][getColumnas()];

        for (int f=0; f<matrizA.length; f++)
        {
            for(int c=0; c<matrizA[f].length; c++)
            {
                matrizT[f][c] = matrizA[f][c];
            }
        }
        for(f=0; f<getColumnas(); f++)
        {
            for(c=0; c<getFilas(); c++)
            {
                System.out.println(matrizT[f][c]);
            }
        }
    }
}