package PjBL1;

import java.util.LinkedList;
import java.util.Queue;

public class QueueFloodFill {
    // Médoto flood fill que executa o algoritmo
    public static void floodFill(int[][] image, int startLine, int startColumn, int targetColor, int newColor) {
        // Dimensões da matriz de imagem
        int numLines = image.length;
        int numColumns = image[0].length;

        // Array bidimensional (quatro direções)
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Cria a estrutura de dados e armazena os pixels a serem processados
        Queue<int[]> queue = new LinkedList<>();        // declara e inicializa uma fila de arrays inteiros
        queue.offer(new int[]{startLine, startColumn}); // adiciona novo elemento com as coordenadas de início

        // Lopp (estrutura não vazia)
        while (!queue.isEmpty()) {
            int[] current = queue.poll(); // recupera e remove o topo da fila ou retorna nulo se a fila for vazia.
            int currentLine = current[0]; // obtém o valor da primeira posição da matriz (linha/ponto processado).
            int currentColumn = current[1]; // obtém o valor da segunda posição da matriz (coluna)

            // Remove um pixel da estrutura (obter coord.)
            if (currentLine < 0 || currentLine >= numLines || currentColumn < 0 || currentColumn >= numColumns || image[currentLine][currentColumn] != targetColor) {
                continue;
            }

            // Atualiza o Pixel com uma nova cor
            image[currentLine][currentColumn] = newColor;

            // Percorre as quatro direções possíveis e adiciona os pixels
            for (int[] dir : directions) { // inicia loop que percorre cada elemento da matriz
                int newLine = currentLine + dir[0]; // nova linha = ponto atual + primeira posição da matriz (movimento vertical)
                int newColumn = currentColumn + dir[1]; // nova coluna = ponto atual + segunda posição da matriz (movimento horizontal)
                queue.offer(new int[] {newLine, newColumn}); // adiciona novo ponto à fila (nova matriz/coordenadas/próximo ponto a ser explorado)
            }
        }
    }
}