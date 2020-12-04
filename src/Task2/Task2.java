package Task2;

import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        int arr[] = {13, 1, 1, 7, 8, 6, 45, 2, 21, 9, 2, 100, 100};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");

    for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.print("\nAfter removing duplicates:");
            int b = 0;
            arr[b] = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[b] != arr[i]) {
                    b++;
                    arr[b] = arr[i];
                }
            }
            for (int i = 0; i <= b; i++) {
                System.out.print(arr[i] + "\t");
            }
        }
    }


