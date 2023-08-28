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
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startLine, startColumn});

        // Lopp (estrutura não vazia)
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentLine = current[0];
            int currentColumn = current[1];

            // Remove um pixel da estrutura (obter coord.)
            if (currentLine < 0 || currentLine >= numLines || currentColumn < 0 || currentColumn >= numColumns || image[currentLine][currentColumn] != targetColor) {
                continue;
            }

            // Atualiza o Pixel com uma nova cor
            image[currentLine][currentColumn] = newColor;

            // Percorre as quatro direções possíveis e adiciona os pixels
            for (int[] dir : directions) {
                int newLine = currentLine + dir[0];
                int newColumn = currentColumn + dir[1];
                queue.offer(new int[] {newLine, newColumn});
            }
        }
    }
}