package esd;

import java.security.InvalidParameterException;
import java.util.Arrays;

public class ListaSequencial <T> {

    T[] area;
    int len = 0;
    final int defcap = 8;

    @SuppressWarnings("unchecked")
    public ListaSequencial() {
        area = (T[])new Object[defcap];
//        Arrays.fill(area, null);
        len = 0;
    }

    @SuppressWarnings("unchecked")
    public void expande(int len) {

    }


    void expande() {
        expande(2*area.length);
    }

    public boolean esta_vazia() {
        return len == 0;
    }

    public int capacidade() {
        return area.length;
    }

    public void adiciona(T elemento) {

    }


    public void remove(int indice) {

    }

    public void substitui(int indice, T valor) {

    }

    public int procura(T valor) {
        return -1;
    }

    public T obtem(int indice) {
        return null;
    }

    public int comprimento() {
        return len;
    }

    public void limpa() {

    }

    public void insere(int indice, T elemento) {

    }

}