import listaEstatica.IndiceInvalidoException;
import listaEstatica.ListaCheiaException;
import listaEstatica.ListaDinamica;
import listaEstatica.ListaVaziaException;

public class Main {
    public static void main(String[] args) throws IndiceInvalidoException, ListaCheiaException, ListaVaziaException {

        ListaDinamica l = new ListaDinamica(15);

        l.adicionarFinal(1);
        l.adicionarFinal(2);
        l.adicionarFinal(3);
        l.adicionarFinal(4);
        l.adicionarFinal(5);
        l.adicionarFinal(6);
        l.adicionarFinal(7);
        l.adicionarFinal(8);
        l.adicionarFinal(9);
        l.adicionarFinal(10);
        l.adicionarFinal(11);
        l.adicionarFinal(12);
        l.adicionarFinal(13);
        l.adicionarFinal(14);
        l.adicionarFinal(15);
        l.print();

    }
}