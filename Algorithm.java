/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school.softwaredevelopment;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

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
        Integer[] sortedArrByMySelf = customSort(intArray2);
        duration = System.nanoTime() - before;
        System.out.println("\nThe Result of customSort built in:\n" + Arrays.toString(sortedArrByMySelf));
        System.out.println("Duration of the Operation in microseconds: " + duration);

    }

    public static Integer[] customSort(int[] integerArray) {

        ArrayList<Integer> sortedArrayList = new ArrayList<>();
        ArrayList<Integer> origArrayList = new ArrayList<>();

        for (int x : integerArray) {
            origArrayList.add(x);
        }

        while (!origArrayList.isEmpty()) {

            int currentInteger = origArrayList.remove(0);

            if (!sortedArrayList.isEmpty() && currentInteger < sortedArrayList.get(sortedArrayList.size() - 1)) {
                sortedArrayList.add(0, currentInteger);
            } else {
                sortedArrayList.add(currentInteger);
            }
        }
        Integer[] sortedArray = new Integer[sortedArrayList.size()];
        return sortedArrayList.toArray(sortedArray);
    }
}
