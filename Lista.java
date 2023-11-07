package listaEncadeada;

public interface Lista {

	public void adicionarInicio(int elemento) throws ListaCheiaException;
    public void adicionarFinal(int elemento) throws ListaCheiaException;
    public void adicionarNoIndice(int elemento, int indice) throws IndiceInvalidoException, ListaCheiaException;
    public int removerInicio() throws ListaVaziaException;
    public int removerFinal() throws ListaVaziaException;
    public int removerElemento(int elemento) throws ListaVaziaException;
    public int tamanho();
    public boolean isVazia();
    public boolean isCheia();
    public void print();
}
