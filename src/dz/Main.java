package dz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите розрядность массива: ");
        int n = scan.nextInt();

        int[] mus = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + " элемент массива: ");
            mus[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(mus[i] + "\n");
            } else
                System.out.print((mus[i]) + ",");
        }

        Function.Max(mus, n);

    }
}