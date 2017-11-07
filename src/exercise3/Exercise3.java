package exercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author allewi01
 * @assignment 3
 */
public class Exercise3 {

    public static final String PATH = "data/";

    public static void main(String[] args) {
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        int[][] result = null;
        try {
            matrix1 = readFile(PATH + "matrix1.txt");
            matrix2 = readFile(PATH + "matrix2.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
            System.out.println("Files " + PATH + "matrix1.txt and " + PATH + "matrix2.txt must exist.");
            System.exit(0);
        } catch (IOException ex) {
        }
        System.out.println("\nMatrix 1 (" + matrix1.length + "x" + matrix1[0].length + "):");
        printMatrix(matrix1);
        System.out.println("\nMatrix 2 (" + matrix2.length + "x" + matrix2[0].length + "):");
        printMatrix(matrix2);
        if (matrix1[0].length == matrix2.length) {
            result = multiply(matrix1, matrix2);
        } else {
            System.out.println("Impossible to multiply these matrices.");
            System.exit(0);
        }
        System.out.println("\nResult (" + result.length + "x" + result[0].length + "): ");
        printMatrix(result);
        try {
            writeMatrix(result, PATH + "matrix3.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("File " + PATH + "matrix3.txt must exist.");
            System.exit(0);
        } catch (IOException ex) {
        }
        System.out.println();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.printf("[ ");
            for (int item : row) {
                System.out.printf("%d ", item);
            }
            System.out.printf("]%n");
        }
    }

    public static void writeMatrix(int[][] matrix, String filename) throws FileNotFoundException, IOException {
        PrintWriter outputFile = new PrintWriter(new FileWriter(filename));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                outputFile.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    outputFile.print(",");
                }
            }
            if (i < matrix.length - 1) {
                outputFile.print("\r\n");
            }
        }
        outputFile.close();
    }

    public static int[][] readFile(String filename) throws FileNotFoundException, IOException {
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String lines = "";
        String line;
        while ((line = inputFile.readLine()) != null) {
            Scanner lineContent = new Scanner(line);
            while (lineContent.hasNext()) {
                lines += lineContent.next();
            }
            lines += "\n";
        }
        lines = lines.substring(0, lines.length() - 1);
        String[] splitlines = lines.split("\n");
        String[] firstline = splitlines[0].split(",");
        int[][] newMatrix = new int[splitlines.length][firstline.length];
        for (int i = 0; i < splitlines.length; i++) {
            String[] thisline = splitlines[i].split(",");
            for (int j = 0; j < thisline.length; j++) {
                newMatrix[i][j] = Integer.valueOf(thisline[j]);
            }
        }
        return newMatrix;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < matrix1[0].length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
