import listaEstatica.IndiceInvalidoException;
import listaEstatica.ListaVaziaException;

public class ListaDinamica implements Lista{


    @Override
    public void adicionarInicio(int elemento) throws ListaCheiaException {

    }

    @Override
    public void adicionarFinal(int elemento) throws ListaCheiaException {

    }

    @Override
    public void adicionarNoIndice(int elemento, int indice) throws IndiceInvalidoException, ListaCheiaException {

    }

    @Override
    public int removerInicio() throws ListaVaziaException {
        return 0;
    }

    @Override
    public int removerFinal() throws ListaVaziaException {
        return 0;
    }

    @Override
    public int removerElemento(int elemento) throws ListaVaziaException {
        return 0;
    }

    @Override
    public int tamanho() {
        return 0;
    }

    @Override
    public boolean isVazia() {
        return false;
    }

    @Override
    public boolean isCheia() {
        return false;
    }

    @Override
    public void print() {

    }
}
