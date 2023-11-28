package filaDinamica;

public class FilaDinamica implements Fila {

    private int array[];
    private int inicio = -1;

    public FilaDinamica(int tamanhoInicial) {
        array = new int[tamanhoInicial];
    }

    public int lenght(){
        return array.length;
    }

    @Override
    public void enfileirar(int e) {

            if (isCheia()) {
                // Criar um novo array com o dobro do tamanho
                int novoTamanho = array.length + 5;
                int[] newArray = new int[novoTamanho];

                // Copiar elementos antigos para o novo array
                for (int i = 0; i <= inicio; i++) {
                    newArray[i] = array[i];
                }

                array = newArray;
            }

            array[++inicio] = e;
        }

        @Override
        public int desenfileirar() throws FilaVaziaException {
            if (isVazia()) {
                throw new FilaVaziaException();
            }

            int elementoDesenfileirado = array[0];

            for (int i = 0; i < inicio; i++) {
                array[i] = array[i + 1];
            }

            inicio--;

            if (array.length >= 5) {
                int novoTamanho = array.length;
                int[] newArray = new int[novoTamanho];

                // Copiar elementos restantes para o novo array
                for (int i = 0; i <= inicio; i++) {
                    newArray[i] = array[i];
                }

                array = newArray;
            }

            return elementoDesenfileirado;
        }

    @Override
    public int quantidade() {
        return inicio + 1;
    }

    @Override
    public boolean isCheia() {
        return inicio == array.length - 1;
    }

    @Override
    public boolean isVazia() {
        return inicio == -1;
    }

    @Override
    public void imprimir() {
        System.out.print("Fila: ");
        for (int i = 0; i <= inicio; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
