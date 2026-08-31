package Sorting;

import java.util.*;

class InsertionSort {

    public static void insertionSort(int[] ids) {

        for (int i = 1; i < ids.length; i++) {

            int key = ids[i];
            int j = i - 1;

            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int[] ids = new int[n];

        System.out.println("Enter employee IDs:");

        for (int i = 0; i < n; i++) {
            ids[i] = sc.nextInt();
        }

        insertionSort(ids);

        System.out.println("Employee IDs in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(ids[i] + " ");
        }
    }
}