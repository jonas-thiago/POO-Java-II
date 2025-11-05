package video;

public class ListaEncadeada<T> {

    private No<T> inicio;

    public void adicionar(T elemento) {
        No<T> celula = new No<T>(elemento);
        this.inicio = celula;
    }
    


    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ListaEncadeada [inicio=").append(inicio).append("]");
        return builder.toString();
    }
}
