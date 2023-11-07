package listaEncadeada;

public class Main {

	public static void main(String[] args) throws ListaCheiaException, ListaVaziaException {
		// [59,90,73,77,17,20], [19,97,73,83,88,87]
		
		Lista listaEncadeada = new ListaEncadeadaCircularComNoCabeca();
		
		listaEncadeada.adicionarFinal(90);
		listaEncadeada.adicionarFinal(73);
		listaEncadeada.adicionarFinal(77);
		listaEncadeada.adicionarFinal(17);
		listaEncadeada.adicionarFinal(20);
		listaEncadeada.print();
		listaEncadeada.adicionarInicio(59);
		listaEncadeada.print();
		listaEncadeada.removerFinal();
		listaEncadeada.print();
		listaEncadeada.removerInicio();
		listaEncadeada.print();
	}

}
