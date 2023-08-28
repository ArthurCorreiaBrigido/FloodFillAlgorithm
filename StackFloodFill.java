package PjBL1;

import java.util.Stack;

public class StackFloodFill {
    // Método flood fill responsável pela execução do algoritmo
    public static void floodFill(int[][] image, int startLine, int startColumn, int targetColor, int newColor) {
        // Dimensões da matriz de imagem
        int numLines = image.length;
        int numColumns = image[0].length;

        // Array bidimensional 'directions' que representa as quatro direções possíveis
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        // Cria a estrutura de dados e armazena os pixels a serem processados
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{startLine, startColumn});

        //Loop (estrutura não vazia)
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
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
                stack.push(new int[]{newLine, newColumn});
            }
        }
    }
}