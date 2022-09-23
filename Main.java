package TranspuestadeunaMatriz.java;

public class Main
{
    public static void main(String[] args)
    {
        MatrizTranspuesta transpuesta = new MatrizTranspuesta(3,3);
        transpuesta.setFilas(3);
        transpuesta.setColumnas(3);

        transpuesta.mostrarMatrizTranspuesta();
        transpuesta.transpuestaMatriz();
    }
}