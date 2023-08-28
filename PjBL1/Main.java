package PjBL1;
//Teste das duas abordagens de armazenamento de valores (Pilha e Fila)
public class Main {
        public static void main(String[] args) {

            //Cria a matriz de imagem inicial(Pilha)
            int[][] image = {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                    {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };

            // Define as coordenadas iniciais (linha inicial e coluna inicial), cor de destino e nova cor.
            int startLine = 2;
            int startColumn = 2;
            int targetColor = image[startLine][startColumn];
            int newColor = 2;

            // Chama o método 'flood fill' da classe (aplicar preenchimento/algoritmo/ abordagem Pilha)
            StackFloodFill.floodFill(image, startLine, startColumn, targetColor, newColor);
            // Chama o método 'printImage' para imprimir a imagem modificada
            printImage(image);


            System.out.println();

            // Cria a matriz de imagem inicial (Fila)
            int[][] image2 = {
                    {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                    {1, 1, 1, 1, 1, 1, 1, 1, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1, 0, 1, 1},
                    {1, 1, 1, 1, 1, 1, 0, 1, 1, 1},
                    {1, 1, 1, 1, 1, 0, 1, 1, 1, 1},
                    {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                    {1, 1, 1, 0, 1, 1, 1, 1, 1, 1},
                    {1, 1, 0, 1, 1, 1, 1, 1, 1, 1},
                    {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                    {0, 1, 1, 1, 1, 1, 1, 1, 1, 1}
            };

            // Chama o método 'flood fill' da classe (aplicar preenchimento/algoritmo/abordagem Fila)
            QueueFloodFill.floodFill(image2, startLine, startColumn, targetColor, newColor);
            // Chama o método printImage para imprimir a nova imagem modificada.
            printImage(image2);
        }

        // O método abaixo imprime a matriz de imagem fornecida.
        public static void printImage(int[][] image){
            for (int[] line : image){   //inicia loop externo (percorre linhas/matriz)
                for (int pixel : line){ // outro loop que percorre cada pixel da linha atual
                    System.out.print(pixel + ""); // Imprime o valor do pixel seguido por um espaço na mesma linha
                }
                System.out.println(); // pula para a próxima linha na saída padrão
            }
        }
    }