import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	
        int[][] matriz = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10); // Gera um número aleatório entre 0 e 9
            }
        }

        // Exibindo a matriz
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Encontrando o maior número na matriz
        int maior = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }

        // Exibindo o maior número encontrado
        System.out.println("Maior número na matriz: " + maior);
    }
}