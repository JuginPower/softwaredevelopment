/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.school;

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
        System.out.println("The Result of Arrays.sort built in:\n"+ Arrays.toString(intArray1));
        System.out.println("Duration of the Operation in microseconds: " + duration);
        
        before = System.nanoTime();
        int[] sortedArrByMySelf = customSort(intArray2);
        duration = System.nanoTime() - before;
        System.out.println("\nThe Result of customSort built in:\n"+ Arrays.toString(sortedArrByMySelf));
        System.out.println("Duration of the Operation in microseconds: " + duration);
        
    }

    public static int[] customSort(int[] integerArray) {

        int[] sortedArray = new int[integerArray.length];
        
        for (int i = 0; i < integerArray.length; i++) {
            
            int[] slicedArray = getSlice(integerArray, i, integerArray.length);
            int smallestIntInSlicedArr = customSearchSmallestInt(slicedArray);
            
            sortedArray[i] = smallestIntInSlicedArr;
        }
        return sortedArray;
    }

    public static int customSearchSmallestInt(int[] arr) {

        int smallestInteger = arr[0];

        for (int zahl : arr) {
            if (zahl < smallestInteger) {
                smallestInteger = zahl;
            }
        }
        return smallestInteger;
    }

    public static int[] getSlice(int[] array, int startIndex, int endIndex) {
  
        int[] slicedArray = new int[endIndex - startIndex];

        for (int i = 0; i < slicedArray.length; i++) {
            slicedArray[i] = array[startIndex + i];
        }

        return slicedArray;
    }
}
