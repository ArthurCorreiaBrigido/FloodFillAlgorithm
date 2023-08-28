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
            int[] current = stack.pop();  // recupera e remove o topo da pilha ou retorna nulo se a pilha for vazia.
            int currentLine = current[0]; // obtém o valor da primeira posição da matriz (linha/ponto processado)
            int currentColumn = current[1]; // // obtém o valor da segunda posição da matriz (coluna)

            // Remove um pixel da estrutura (obter coord.) e verifica se as coord. estão dentro dos limites da matriz (cor/pixel = cor/destino)
            if (currentLine < 0 || currentLine >= numLines || currentColumn < 0 || currentColumn >= numColumns || image[currentLine][currentColumn] != targetColor) {
                continue;
            }

            // Atualiza o Pixel com uma nova cor
            image[currentLine][currentColumn] = newColor;

            // Percorre as quatro direções possíveis e adiciona os pixels
            for (int[] dir : directions) {  // inicia loop que percorre cada elemento da matriz
                int newLine = currentLine + dir[0]; // nova linha = ponto atual + primeira posição da matriz (movimento vertical)
                int newColumn = currentColumn + dir[1]; // nova coluna = ponto atual + segunda posição da matriz (movimento horizontal)
                stack.push(new int[]{newLine, newColumn}); //  // adiciona novo ponto à pilha (nova matriz/coordenadas/próximo ponto a ser explorado)
            }
        }
    }
}