package one.digitalinovation;

public class Pilha {

    private No referenciaNoEntradaPilha;

    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

//    adiciona um elemento no topo da pilha
    public void push(No novoNo) {
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha= novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

//    exclui o ultimo elemento colocado na pilha
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPoped;
        }
        return null;
    }

//    top ou peek, retorna o elemento do topo da pilha sem excluir
    public No top() {
        return referenciaNoEntradaPilha;
    }

//    verifica se a pilha está vazia
    public boolean isEmpty() {
//        if (referenciaNoEntradaPilha == null) {
//            return true;
//        }
//        return false;
        return referenciaNoEntradaPilha == null ? true : false;
    }
}
