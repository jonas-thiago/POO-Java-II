package aula;
// Implementação básica de um nó

import video.No;

public class No {
    int dado;
    No proximo;

    public No(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}