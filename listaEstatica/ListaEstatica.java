package listaEstatica;

import excecoes.IndiceInvalidoException;
import listaEncadeada.ListaCheiaException;
import listaEncadeada.ListaVaziaException;

public class ListaEstatica implements Lista{

	private int[] array;
	private int quantidade;

	public ListaEstatica(int tamanho) {
		array = new int[tamanho];
	}

	public void adicionarInicio(int elemento) throws ListaCheiaException {
		if(isCheia()) {
			throw new ListaCheiaException("Lista cheia");
		}

		for (int i = quantidade; i > 0; i--) {
			array[quantidade] = array[quantidade - 1];
		}

		array[0] = elemento;
		quantidade++;
	}

	public void adicionarFinal(int elemento) throws ListaCheiaException {
		if(isCheia()) {
			throw new ListaCheiaException("Lista cheia");
		}
		array[quantidade++] = elemento;
	}

	public void adicionarNoIndice(int elemento, int indice) throws IndiceInvalidoException, ListaCheiaException {
		if (indice < 0 || indice > array.length) {
			throw new IndiceInvalidoException();
		}

		if (isCheia()) {
			throw new ListaCheiaException("Lista cheia");
		}

		for (int i = quantidade; i > indice; i--) {
			array[i] = array[i - 1];
		}

		array[indice] = elemento;
		quantidade++;

	}

	public int removerInicio() throws ListaVaziaException {
		if (isVazia()) {
			throw new ListaVaziaException("Lista vazia");
		}

		int lixo = array[0];

		for (int i = 0; i < quantidade - 1; i++) {
			array[i] = array[i + 1];
		}

		quantidade--;

		return lixo;
	}

	public int removerFinal() throws ListaVaziaException {
		if(isVazia()) {
			throw new ListaVaziaException("Lista vazia");
		}

		int lixo = array[quantidade - 1];
		quantidade--;

		return lixo;
	}

	public int removerElemento(int i) throws ListaVaziaException, IndexOutOfBoundsException{
		if (i < 0 || i >= array.length) {
			throw new IndexOutOfBoundsException("Índice fora dos limites da lista.");
		}

		int elementoRemovido = array[i];

		for (int j = i; j < quantidade - 1; j++) {
			array[j] = array[j + 1];
		}

		quantidade--;
		return elementoRemovido;
	}

	public int tamanho() {
		return quantidade;
	}

	public boolean isVazia() {
		return quantidade == 0;
	}

	public boolean isCheia() {
		return quantidade == array.length;
	}

	public void print() {
		System.out.print("INICIO -> ");
		for (int i = 0; i < quantidade; i++) {
			System.out.println(array[i] + ",");
		} 
		System.out.println("<- FIM");
	}

}
