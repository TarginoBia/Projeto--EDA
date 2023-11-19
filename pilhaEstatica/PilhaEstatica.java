package pilha;

public class PilhaEstatica implements Pilha{

	private int[] array;
	private int topo = -1;
	
	public PilhaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	public void push(int e) throws PilhaCheiaException {
		if (isCheia()) {
            throw new PilhaCheiaException("A pilha está cheia. Não é possível inserir mais elementos.");
        }
        array[++topo] = e;
	}

	public int pop() throws PilhaVaziaException {
		if (isVazia()) {
            throw new PilhaVaziaException("A pilha está vazia. Não é possível remover elementos.");
        }
        return array[topo--];
	}

	public int topo() throws PilhaVaziaException {
		if (isVazia()) {
            throw new PilhaVaziaException("A pilha está vazia. Não há topo para retornar.");
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
		System.out.println("Conteúdo da pilha:");
        for (int i = topo; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
	}
}
