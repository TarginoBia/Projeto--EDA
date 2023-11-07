package listaEncadeada;

public class ListaEncadeadaCircularComNoCabeca implements Lista{

        private No cabeca;
        private int tamanho;

        public ListaEncadeadaCircularComNoCabeca() {
            cabeca = new No(-1); // Nó cabeça não contém dados reais
            cabeca.setProximo(cabeca); // Inicialmente, o nó cabeça aponta para ele mesmo
            tamanho = 0;
        }

        public void adicionarInicio(int elemento) {
            No novoNo = new No(elemento);
            novoNo.setProximo(cabeca.getProximo());
            cabeca.setProximo(novoNo);
            tamanho++;
        }

        public void adicionarFinal(int valor) {
            No novoNo = new No(valor);
            novoNo.setProximo(cabeca.getProximo());
            cabeca.setProximo(novoNo);
            cabeca = novoNo; // Atualiza o nó cabeça para o novo nó (último elemento)
            tamanho++;
        }

        public void adicionarNoIndice(int elemento, int indice) {
            if (isCheia()) {
                throw new RuntimeException("A lista está cheia.");
            }

            if (indice < 0 || indice > tamanho) {
                throw new RuntimeException("Índice inválido.");
            }

            if (indice == 0) {
                adicionarInicio(elemento);
            } else if (indice == tamanho) {
                adicionarFinal(elemento);
            } else {
                No novoNo = new No(elemento);
                No anterior = cabeca.getProximo();
                for (int i = 0; i < indice - 1; i++) {
                    anterior = anterior.getProximo();
                }
                novoNo.setProximo(anterior.getProximo());
                anterior.setProximo(novoNo);
                tamanho++;
            }
        }

        public int removerInicio() {
            if (isVazia()) {
                throw new RuntimeException("A lista está vazia.");
            }

            No primeiro = cabeca.getProximo();
            cabeca.setProximo(primeiro.getProximo());
            tamanho--;
            return primeiro.getDado();
        }

        public int removerFinal() {
            if (isVazia()) {
                throw new RuntimeException("A lista está vazia.");
            }

            No atual = cabeca.getProximo();
            No anterior = cabeca;

            while (atual.getProximo() != cabeca) {
                anterior = atual;
                atual = atual.getProximo();
            }

            anterior.setProximo(cabeca);
            cabeca = anterior; // Atualiza o nó cabeça para o novo último elemento
            tamanho--;
            return atual.getDado();
        }

        public int removerElemento(int elemento) {
            if (isVazia()) {
                throw new RuntimeException("A lista está vazia.");
            }

            if (cabeca.getProximo().getDado() == elemento) {
                return removerInicio();
            }

            No atual = cabeca.getProximo();
            No anterior = cabeca;

            while (atual != cabeca) {
                if (atual.getDado() == elemento) {
                    anterior.setProximo(atual.getProximo());
                    tamanho--;
                    return atual.getDado();
                }

                anterior = atual;
                atual = atual.getProximo();
            }

            throw new RuntimeException("Elemento não encontrado na lista.");
        }

        public int tamanho() {
                return tamanho;
        }

        public boolean isVazia() {
            return tamanho == 0;
        }

        public boolean isCheia() {
            return false;
        }

        public void print() {
            if (isVazia()) {
                System.out.println("A lista encadeada circular está vazia.");
                return;
            }

            No atual = cabeca.getProximo();
            while (atual != cabeca) {
                System.out.print(atual.getDado() + " ");
                atual = atual.getProximo();
            }
            System.out.println();
        }


}

