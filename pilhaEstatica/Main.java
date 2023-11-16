package pilha;

public class Main {

	public static void main(String[] args) throws PilhaCheiaException, PilhaVaziaException {
		//[42,17,88,29,55,63]
		PilhaEstatica pilha = new PilhaEstatica(6);
		
		pilha.push(42);
		pilha.push(17);
		pilha.push(88);
		pilha.push(29);
		pilha.push(55);
		pilha.push(63);
		pilha.pop();
		pilha.pop();
		pilha.pop();
		pilha.imprimir();
	}

}
