# Experimentos sobre complexidade de algoritmos

Este pequeno projeto tem por finalidade realizar experimentos sobre complexidade de algoritmos. Ao final de um experimento, um gráfico relacionando o tamanho do problema ao tempo de execução é apresentado.

A interface do experimento é web. Assim, execute a aplicação e então, no seu navegador, acesse esta URL:
* [Link para o experimento](http://localhost:8080/)

A tela apresentada possui duas caixas de texto e um botão para envio, como ilustrado nesta figura:

![Tela do experimento](/imagens/tela-complexidade.png)

Na caixa sobre o tamanho do problema você deve escolher um número que represente o maior tamanho do problema a ser analisado. Na segunda caixa defina qual o incremento no tamanho do problema a cada iteração. Por exemplo, se o tamanho do problema for 1000, e o incremento for 100, o experimento será executado para casos com tamanho 0, 100, 200, ..., até 1000.

Uma vez escolhidos os valores e enviado para a aplicação, um gráfico do tempo em função do tamanho do problema será mostrado. Isso pode demorar um pouco, dependendo do algoritmo que estiver sendo investigado e do tamanho do problema !

## Algoritmo a ser investigado

O algoritmo a ser investigado deve ser escrito no método _executa_ da classe [_App_](https://github.com/IFSCADS/bigo/blob/1e86a0f1ec26550852043d6c02c556fe8d3a7358/src/main/java/bigo/App.java#L5) (ver package _bigo_). A classe App fornecida foi escrita para executar a procura em uma lista sequiencial. Outros algoritmos e operações das estruturas de dados podem ser investigadas usando essa estrutura.

**Importante**: suas estruturas de dados devem estar na package _esd_ para que possam ser usadas nas medições.
