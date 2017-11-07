package exercise1;

import java.util.Scanner;
import java.util.Random;

/**
 * @author allewi01
 * @assignment 1
 */
public class Exercise1 {

    public static void main(String args[]) {
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = rnd.nextInt(10);
        }
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8(numbers);
        task9();
        task10();
    }

    public static void task1() {
        System.out.println("Hello World");
    }

    public static void task2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("huh");
            } else if (i % 3 == 0) {
                System.out.println("foo");
            } else if (i % 5 == 0) {
                System.out.println("bar");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void task3() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    public static void task4() {
        int sum = 0;
        long product = 1;
        for (int i = 1; i <= 20; i++) {
            sum += i;
            product *= i;
        }
        System.out.println(sum);
        System.out.println(product);
    }

    public static void task5() {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        System.out.print("Enter your full name: ");
        name = keyboard.nextLine();
        String initials = String.valueOf(name.charAt(0));
        char space = ' ';
        for (int i = 1; i < name.length() - 1; i++) {
            if (name.charAt(i) == space) {
                initials += String.valueOf(name.charAt(i + 1));
            }
        }
        System.out.println(initials);
    }

    public static void task6() {
        int[] cubes = new int[10];
        for (int i = 0; i < 10; i++) {
            cubes[i] = i * i * i;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(cubes[i]);
        }
    }

    public static void task7() {
        Random rnd = new Random();
        rnd.setSeed(252);
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = rnd.nextInt(100);
        }
        Scanner keyboard = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter a number: ");
        num = Integer.valueOf(keyboard.nextLine());
        boolean found = false;
        for (int i = 0; i < 100; i++) {
            if (numbers[i] == num) {
                found = true;
            }
        }
        if (found) {
            System.out.println(num + " is in the array");
        } else {
            System.out.println(num + " is not in the array");
        }
    }

    public static int task8(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean task9() {
        Scanner keyboard = new Scanner(System.in);
        String word = "";
        System.out.print("Enter a word: ");
        word = keyboard.nextLine();
        boolean ordered = true;
        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) > word.charAt(i + 1)) {
                ordered = false;
            }
        }
        if (ordered) {
            System.out.println("The letters of " + word + " are in order");
        } else {
            System.out.println("The letters of " + word + " are not in order");
        }
        return ordered;
    }

    public static void task10() {
        boolean[] prime = new boolean[100];
        for (int i = 0; i < 100; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        int current = 2;
        while (current < 10) {
            for (int i = current; i < 100; i++) {
                if ((i + 1) % current == 0) {
                    prime[i] = false;
                }
            }
            for (int i = current; i < 10; i++) {
                if (prime[i]) {
                    current = i + 1;
                    break;
                }
                if (i == 9) {
                    current = 10;
                }
            }
        }
        for (int i = 0; i < 100; i++) {
            if (prime[i]) {
                System.out.println(i + 1);
            }
        }
    }

}
