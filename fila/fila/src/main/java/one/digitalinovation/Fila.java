package one.digitalinovation;

public class Fila {
    private No referenciaEntradaFila;

//    construtor
    public Fila() {
        this.referenciaEntradaFila = referenciaEntradaFila;
    }

//    metodo enfileirar
    public void enqueue(No novoNo) {
        novoNo.setReferenciaNo(referenciaEntradaFila);
        referenciaEntradaFila = novoNo;
    }

//    retorna o primeiro nó da fila
    public No first() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaEntradaFila;
            while (true) {
                if (primeiroNo.getReferenciaNo() != null) {
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else {
                    break;
                }
            }
        }
        return null;
    }

    public No dequeue() {
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
