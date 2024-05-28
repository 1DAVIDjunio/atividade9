public class Modelo {
    private int[] numeros;

    public Modelo() {
        numeros = new int[10];
    }

    public void setNumero(int indice, int numero) {
        numeros[indice] = numero;
    }

    public int[] getNumeros() {
        return numeros;
    }
}
