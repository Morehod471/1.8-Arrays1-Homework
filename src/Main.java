import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        double[] numbers2 = new double[]{1.57, 7.654, 9.986};
        for (int a = 0; a < numbers2.length; a++) {
            System.out.println(numbers2[a]);
        }
        int[] arr = {2, 4, 8, 16};
        for (int b = 0; b < 4; b++) {
            System.out.println(arr[b]);
            }
    }

    private static void task2() {
        System.out.println("Задача 2");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
        double[] numbers2 = new double[]{1.57, 7.654, 9.986};
        for (int a = 0; a < numbers2.length; a++) {
            if (a == numbers2.length - 1) {
                System.out.print(numbers2[a]);
            } else {
                System.out.print(numbers2[a] + ", ");
            }
        }
        System.out.println();
        int[] arr = {2, 4, 8, 16};
        for (int b = 0; b < arr.length; b++) {
            if (b == arr.length - 1) {
                System.out.print(arr[b]);
            } else {
                System.out.print(arr[b] + ", ");
            }
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        int[] numbers = new int[]{1, 2, 3};
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
        double[] numbers2 = new double[]{1.57, 7.654, 9.986};
        for (int a = numbers2.length - 1; a >= 0; a--) {
            if (a == 0) {
                System.out.print(numbers2[a]);
            } else {
                System.out.print(numbers2[a] + ", ");
            }
        }
        System.out.println();
        int[] arr = {2, 4, 8, 16};
        for (int b = arr.length - 1; b >= 0; b--) {
            if (b == 0) {
                System.out.print(arr[b]);
            } else {
                System.out.print(arr[b] + ", ");
            }
        }
        System.out.println();

    }

    private static void task4() {
        System.out.println("Задача 4");
        int[] intNumbers = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0; i < intNumbers.length; i++) {
            if (intNumbers[i] % 2 == 0) {
                intNumbers[i] = intNumbers[i];
            } else {
                intNumbers[i] = intNumbers[i]+1;
            }
        }
        System.out.println(Arrays.toString(intNumbers));
    }
}
