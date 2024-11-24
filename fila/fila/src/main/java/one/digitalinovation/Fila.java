package one.digitalinovation;

public class Fila<T> {
    private No<T> referenciaEntradaFila;

//    construtor
    public Fila() {
        this.referenciaEntradaFila = referenciaEntradaFila;
    }

//    Adiciona um elemento ao final da fila
    public void enqueue(T object) {
        No novoNo = new No(object);
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

//    retorna o primeiro elemento da fila sem removê-lo
    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

//    remove e retorna o primeiro elemento da fila
    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            No noAuxiliar = referenciaEntradaFila;

            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

//    verifica se a fila está vazia
    public boolean isEmpty() {
        return referenciaEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = referenciaEntradaFila;

        if (referenciaEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]------>";
                if (noAuxiliar.getReferenciaNo() != null) {
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = "null";
        }
        return  stringRetorno;
    }
}
