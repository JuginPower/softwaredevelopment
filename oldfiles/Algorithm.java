/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school.softwaredevelopment;

import java.util.Arrays;

/**
 *
 * @author kraft
 */
public class Algorithm {

    public static void main(String[] args) {

        // Für Array.sort
        int[] intArray1 = new int[]{90, 23, 5, 109, 12, 22, 67, 34};

        // Für customSort
        int[] intArray2 = intArray1.clone();

        long before = System.nanoTime();
        Arrays.sort(intArray1);
        long duration = System.nanoTime() - before;
        System.out.println("The Result of Arrays.sort built in:\n" + Arrays.toString(intArray1));
        System.out.println("Duration of the Operation in microseconds: " + duration);

        before = System.nanoTime();
        int[] sortedArrByMySelf = customSort(intArray2);
        duration = System.nanoTime() - before;
        System.out.println("\nThe Result of customSort built in:\n" + Arrays.toString(sortedArrByMySelf));
        System.out.println("Duration of the Operation in microseconds: " + duration);

    }

    public static int[] customSort(int[] integerArray) {

        for (int i = 0; i < integerArray.length; i++) {
            for (int j = i + 1; j < integerArray.length; j++) {
                int tmp = 0;
                if (integerArray[i] > integerArray[j]) {
                    tmp = integerArray[i];
                    integerArray[i] = integerArray[j];
                    integerArray[j] = tmp;
                }
            }
        }
        return integerArray;
    }
}
