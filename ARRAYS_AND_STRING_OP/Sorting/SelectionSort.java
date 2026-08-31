package Sorting;

import java.util.*;

class SelectionSort {

    public static void selectionSort(int[] scores) {

        for (int i = 0; i < scores.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < scores.length; j++) {
                if (scores[j] < scores[min]) {
                    min = j;
                }
            }

            int temp = scores[i];
            scores[i] = scores[min];
            scores[min] = temp;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] scores = new int[n];

        System.out.println("Enter exam scores:");

        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        selectionSort(scores);

        System.out.println("Exam scores in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.print(scores[i] + " ");
        }
    }
}