package one.digitalinovation;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

//    tamanho da lista
    public int size() {
        int tamanhoLista = 0;
        No<T> referenciaAuxiliar = referenciaEntrada;

        while (true) {
            if (referenciaAuxiliar != null) {
                tamanhoLista ++;
                if (referenciaAuxiliar.getProximoNo() != null) {
                    referenciaAuxiliar = referenciaEntrada.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }

//    verifica se a lista está vazia
    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }


}
