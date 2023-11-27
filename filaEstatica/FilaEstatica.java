package filaEstatica;

public class FilaEstatica implements Fila{

	private int array[];
	private int inicio = -1;
	
	public FilaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	public void enfileirar(int e) throws FilaCheiaException {
		if(isCheia()) {
			throw new FilaCheiaException();
		}
		
		array[++inicio] = e;
	}

	public int desenfileirar() throws FilaVaziaException {
		if (isVazia()) {
            throw new FilaVaziaException();
        }

        int elementoDesenfileirado = array[0];

        for (int i = 0; i < inicio; i++) {
            array[i] = array[i + 1];
        }

        inicio--;

        return elementoDesenfileirado;
	}

	public int quantidade() {
		return inicio + 1;
	}

	public boolean isCheia() {
		return inicio == array.length - 1;
	}

	public boolean isVazia() {
		return inicio == -1;
	}

	public void imprimir() {
		System.out.print("Fila: ");
        for (int i = 0; i <= inicio; i++) {
            System.out.print(array[i] + " ");
        }
	}


}
