package pilha;

public class PilhaEstatica implements Pilha{

	private int[] array;
	private int topo = -1;
	
	public PilhaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	public void push(int e) throws PilhaCheiaException {
		if (isCheia()) {
            throw new PilhaCheiaException("A pilha est� cheia. N�o � poss�vel inserir mais elementos.");
        }
        array[++topo] = e;
	}

	public int pop() throws PilhaVaziaException {
		if (isVazia()) {
            throw new PilhaVaziaException("A pilha est� vazia. N�o � poss�vel remover elementos.");
        }
        return array[topo--];
	}

	public int topo() throws PilhaVaziaException {
		if (isVazia()) {
            throw new PilhaVaziaException("A pilha est� vazia. N�o h� topo para retornar.");
        }
        return array[topo];
	}

	public boolean isCheia() {
		return topo == array.length -1;
	}

	public boolean isVazia() {
		return topo == -1;
	}

	public int quantidade() {
		return topo + 1;
	}

	public void imprimir() {
		System.out.println("Conte�do da pilha:");
        for (int i = 0; i <= topo; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
	}
}
