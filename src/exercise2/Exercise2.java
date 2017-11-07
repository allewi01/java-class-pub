package exercise2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author allewi01
 * @assignment 2
 */
public class Exercise2 {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        rnd.setSeed(252);
        int[] numberArr = new int[10];
        for (int i = 0; i < 10; i++) {
            numberArr[i] = rnd.nextInt(100);
        }
        ArrayList<Integer> numberLst = new ArrayList();
        for (int i = 0; i < 10; i++) {
            numberLst.add(rnd.nextInt(100));
        }
        System.out.println("\n----- Task 1 -----");
        task1(3);
        System.out.println("\n----- Task 2 -----");
        System.out.println(task2(numberArr, 90));
        System.out.println("\n----- Task 3 -----");
        System.out.println(task3(numberArr, 75));
        System.out.println("\n----- Task 4 -----");
        task4(numberArr);
        System.out.println("\n----- Task 5 -----");
        task5(numberArr);
        System.out.println("\n----- Task 6 -----");
        task6();
        System.out.println("\n----- Task 7 -----");
        task7();
        System.out.println("\n----- Task 8 -----");
        System.out.println(task8(numberLst, 75));
        System.out.println("\n----- Task 9 -----");
        task9();
        System.out.println("\n----- Task 10 -----");
        task10(task9());
    }
    
    public static void task1(int n) {
        int[] results = new int[n];
        boolean done = false;
        for (int i = 0; i < n; i++) {
            results[i] = 1;
        }
        while (true) {
            for (int i = n - 2; i >= 0; i--) {
                results[i + 1] = results[i];
            }
            results[0] = rnd.nextInt(2);
            if (results[0] == 0) {
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            done = true;
            for (int i = 0; i < n; i++) {
                if (results[i] != 0) {
                    done = false;
                }
            }
            if (done) {
                break;
            }
        }
    }
    
    public static boolean task2(int[] arr, int n) {
        boolean larger = true;
        for (int i = 0; i < arr.length; i++) {
            if (n <= arr[i]) {
                larger = false;
            }
        }
        return larger;
    }
    
    public static int task3(int[] arr, int threshold) {
        int below = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < threshold) {
                below++;
            }
        }
        return below;
    }
    
    public static void task4(int[] arr) {
        int largest = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int difference = 100 - largest;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += difference;
            System.out.println(arr[i]);
        }
    }
    
    public static void task5(int[] arr) {
        int[] scores = new int[5];
        for (int i = 0; i < 5; i++) {
            scores[i] = 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 90) {
                scores[0]++;
            } else if (arr[i] >= 80) {
                scores[1]++;
            } else if (arr[i] >= 70) {
                scores[2]++;
            } else if (arr[i] >= 60) {
                scores[3]++;
            } else {
                scores[4]++;
            }
        }
        System.out.println("A: " + scores[0]);
        System.out.println("B: " + scores[1]);
        System.out.println("C: " + scores[2]);
        System.out.println("D: " + scores[3]);
        System.out.println("F: " + scores[4]);
    }
    
    public static void task6() {
        ArrayList<Double> arr = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        double input = -1.0;
        while (input != 0.0) {
            input = Double.valueOf(keyboard.nextLine());
            arr.add(input);
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            System.out.println(arr.get(i));
        }
    }
    
    public static void task7() {
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add(rnd.nextInt(51) + 50);
            System.out.println(arr.get(i));
        }
    }
    
    public static int task8(ArrayList<Integer> arrLst, int threshold) {
        int values = 0;
        for (int i = 0; i < arrLst.size(); i++) {
            if (arrLst.get(i) < threshold) {
                values++;
            }
        }
        return values;
    }
    
    public static int[][] task9() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
        return table;
    }
    
    public static void task10(int[][] matrix) {
        int[] rows = new int[matrix.length];
        int[] columns = new int[matrix[0].length];
        for (int i = 0; i < rows.length; i++) {
            rows[i] = 0;
        }
        for (int i = 0; i < columns.length; i++) {
            columns[i] = 0;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rows[i] += matrix[i][j];
                columns[j] += matrix[i][j];
            }
        }
        System.out.println("Rows: ");
        for (int i = 0; i < rows.length; i++) {
            System.out.printf("%4d", rows[i]);
        }
        System.out.println();
        System.out.println("Columns: ");
        for (int i = 0; i < columns.length; i++) {
            System.out.printf("%4d", columns[i]);
        }
        System.out.println();
    }
    
}
