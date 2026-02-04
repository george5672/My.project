package HW10;

import java.util.Random;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matrix = new int[4][4];

        long sumEvenRows = 0;
        long sumOddRows = 0;
        long productEvenCols = 1;
        long productOddCols = 1;

        System.out.println("Матриця 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(50) + 1;
                System.out.print(matrix[i][j] + "\t");

                if (i % 2 == 0) sumEvenRows += matrix[i][j];
                else sumOddRows += matrix[i][j];
            }
            System.out.println();
        }

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (j % 2 == 0) productEvenCols *= matrix[i][j];
                else productOddCols *= matrix[i][j];
            }
        }

        int targetSum = 0;
        for (int j = 0; j < 4; j++) targetSum += matrix[0][j];

        boolean isMagic = true;
        int diag1 = 0, diag2 = 0;

        for (int i = 0; i < 4; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += matrix[i][j];
                colSum += matrix[j][i];
            }
            if (rowSum != targetSum || colSum != targetSum) isMagic = false;
            diag1 += matrix[i][i];
            diag2 += matrix[i][3 - i];
        }

        System.out.println("\nСума у парних рядках: " + sumEvenRows);
        System.out.println("Сума у непарних рядках: " + sumOddRows);
        System.out.println("Добуток у парних стовпцях: " + productEvenCols);
        System.out.println("Добуток у непарних стовпцях: " + productOddCols);
        System.out.println("Магічний квадрат: " + (isMagic && diag1 == targetSum && diag2 == targetSum ? "Так" : "Ні"));
    }
}