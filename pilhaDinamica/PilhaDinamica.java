package pilhaDinamica;

import pilha.PilhaVaziaException;

public class PilhaDinamica implements Pilha{

	    private int[] array;
	    private int tamanho;
	    private int topo = -1;

	    public PilhaDinamica(int capacidadeInicial) {
	        this.tamanho = capacidadeInicial;
	        this.array = new int[capacidadeInicial];
	    }

	    public void redimensionarArray() {
	        int novoTamanho = tamanho * 2;
	        int[] novoArray = new int[novoTamanho];
	        System.arraycopy(array, 0, novoArray, 0, tamanho);
	        array = novoArray;
	        tamanho = novoTamanho;
	    }

	    public void push(int e) {
	        if (topo == tamanho - 1) {
	            redimensionarArray();
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
	        // Uma pilha dinâmica nunca está cheia usando um array normal
	        return false;
	    }

	    public boolean isVazia() {
	        return topo == -1;
	    }

	    public int quantidade() {
	        return topo + 1;
	    }

	    public void imprimir() {
	        System.out.println("Pilha:");
	        for (int i = topo; i >= 0; i--) {
	            System.out.println(array[i] + " ");
	        }
	    }
	}
