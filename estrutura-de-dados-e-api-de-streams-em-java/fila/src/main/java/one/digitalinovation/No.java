package one.digitalinovation;

public class No<T> {
    private T object;
    private No<T> referenciaNo;

    public No(T object) {
        this.referenciaNo = null;
        this.object = object;
    }

    public No() {

    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
