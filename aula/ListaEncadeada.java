package aula;
// A classe principal da lista

import video.No;

public class ListaEncadeada {
    No cabeca; // A cabeça da lista

    public void adicionar(int dado) {
        No novoNo = new No(dado);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
    }
}