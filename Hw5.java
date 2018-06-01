// Name: Ritesh Deshmukh

import javax.swing.*;
import java.util.Arrays;

public class Hw5 {

    public static int getSize(int num){
        int size = String.valueOf(num).length();
        return size;
    }
    public static int[] fillArray(int num, int[] intArray){

        String s = Integer.toString(num);
        // int newArray[] = new int[s.length()];
        for (int i = 0; i < getSize(num); i++){
            intArray[i] = s.charAt(i) - '0';
        }
        return intArray;
    }

    private static boolean isPalindrome(int[] intArray) {
        if (null == intArray)
            return true;

        for (int i = 0; i < intArray.length / 2; ++i)
            if (intArray[i] != intArray[intArray.length - 1 - i])
                return false;

        return true;
    }

    public static void main(String args[]){
        int num;
        // System.out.println("Test");


        num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number:"));
        // System.out.println("Length = " + getSize(num));

        while (num != -99){
            int[] intArray = new int[getSize(num)];

            JOptionPane.showMessageDialog(null,"Entered number is: " + Arrays.toString(fillArray(num,intArray)) + "\nLength = " + getSize(num));

            if (isPalindrome(intArray)) {
                // System.out.println("The number : " + Arrays.toString(fillArray(num,intArray)) + "\nIs a Palindrome.");
                JOptionPane.showMessageDialog(null,"The number : " + Arrays.toString(fillArray(num,intArray)) + "\nIs a Palindrome.");
            }
            else {
                // System.out.println("The number : " + Arrays.toString(fillArray(num,intArray)) + "\nIs NOT a Palindrome.");
                JOptionPane.showMessageDialog(null,"The number : " + Arrays.toString(fillArray(num,intArray)) + "\nIs NOT a Palindrome.");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Enter a Number:"));

        }
        if (num == -99){
            System.exit(0);
        }




    }
}
