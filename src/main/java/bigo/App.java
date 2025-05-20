package bigo;

import esd.ListaSequencial;

public class App {

    ListaSequencial<Integer> lista;
    int n;

    App(int n) {
        // a lista a ser usada tem tamanho n
        // n é então o tamnanho do problema
        lista = new ListaSequencial<>();
        this.n = n;

        // armazena números na lista
        for (int j=0; j < n; j++) {
            lista.adiciona(j);
        }
    }

    public void executa() {
        // faz uma busca na lista ...
        // procura um número que não existe (para obter o pior caso !)
        Integer nao_existente = Integer.valueOf(lista.comprimento());

        lista.procura(nao_existente);

    }
}
