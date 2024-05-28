public class Controlador {
    private Modelo modelo;
    private Visao visao;

    public Controlador(Modelo modelo, Visao visao) {
        this.modelo = modelo;
        this.visao = visao;
    }

    public void ordenarNumerosInsertionSort() {
        int[] numeros = modelo.getNumeros();
        int[] numerosOrdenados = insertionSort(numeros);
        visao.mostrarNumerosOrdenados(numerosOrdenados);
    }

    public void ordenarNumerosQuickSort() {
        int[] numeros = modelo.getNumeros();
        int[] numerosOrdenados = quickSort(numeros, 0, numeros.length - 1);
        visao.mostrarNumerosOrdenados(numerosOrdenados);
    }

    private int[] insertionSort(int[] numeros) {
        // Implementação do Insertion Sort
        return numeros;
    }

    private int[] quickSort(int[] numeros, int inicio, int fim) {
        // Implementação do Quick Sort
        return numeros;
    }

    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        Visao visao = new Visao();
        Controlador controlador = new Controlador(modelo, visao);

        // Armazenar 10 números (para fins de teste)
        for (int i = 0; i < 10; i++) {
            modelo.setNumero(i, (int) (Math.random() * 100)); // Números aleatórios entre 0 e 99
        }

        // Ordenar e mostrar os números usando Insertion Sort
        controlador.ordenarNumerosInsertionSort();

        // Ordenar e mostrar os números usando Quick Sort
        controlador.ordenarNumerosQuickSort();
    }
}
