# FloodFillAlgorithm
PjBL 1 - Flood Fill (Arthur Correia Brígido e Bell Jamyle Duwe Klemann )

Nosso programa demonstra e compara duas formas de implementação do algoritmo de Flood Fill. As duas abordagens são modularizadas em classes distintas, sendo entre o uso de pilha e fila.

. Classe "StackFloodFill"
Essa classe implementa o algoritmo utilizando uma pilha de forma a explorar o vizinho dos pixels, preechendo a região que compartilha a mesma cor inicial.

. Classe "QueueFloodFill"
Nessa classe o algoritmo é implementado utilizando uma fila. Possui uma abordagem semelhante à com pilha, porém os pixels são armazenados em uma fila e processados de acordo com a ordem de chegada.

. Classe "Main"
A classe cria uma matriz que simula uma imagem binária com áreas a serem preenchidas. Duas coordenadas são definidas juntamente com as cores de destino e a nova cor para o preenchimento.
Ambas as abordagens chamam o método 'floodFill' das classes anteriores e duas imagens são impressas para analisar e comparar os resultados.
