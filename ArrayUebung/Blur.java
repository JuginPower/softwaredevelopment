package ArrayUebung;
import java.util.*;

/**
 * blur
 */
public class Blur {

    public static void main(String[] args) {
        
        Random rnd = new Random(1234);
        double[][] blurs = new double[4][4];

        for (int i = 0; i < blurs.length; i++) {
            for (int j = 0; j < blurs[i].length; j++) {
                blurs[i][j] = rnd.nextInt(9)+1;
            }
        }

        double[][] newBlurs = new double[4][4];

        for (int i = 0; i < blurs.length; i++) {
            for (int j = 0; j < blurs[i].length; j++) {
                
                double Avarage = getAvarage(blurs, i, j);
                newBlurs[i][j] = Avarage;
            }
        }

        System.out.println("\nOriginal Array of blurs:");
        displayDouble2DimensionArray(blurs);
        System.out.println("\nNew Array of blurs:");
        displayDouble2DimensionArray(newBlurs);
    }

    public static void displayDouble2DimensionArray(double[][] arr) {
        for (int i=0; i<arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static double getAvarage(double[][] arr, int firstIndex, int secondIndex) {
        
        double leftNumber;
        double rightNumber;  
        try {
            leftNumber = arr[firstIndex][secondIndex-1];
        } catch (Exception e) {
            leftNumber = arr[firstIndex][secondIndex];
        }
        try {
            rightNumber = arr[firstIndex][secondIndex+1];
        } catch (Exception e) {
            rightNumber = arr[firstIndex][secondIndex];
        }
        return (leftNumber + rightNumber) / 2;
    }
}