public class Main {
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
