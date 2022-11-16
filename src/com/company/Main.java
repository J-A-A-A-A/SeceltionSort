package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Variables
        int max = 1;
        Scanner userInput = new Scanner(System.in);

        //Setting the amount of numbers in the array
        System.out.println("How many numbers would u like?");
        max = userInput.nextInt();
        sortedNumbers num = new sortedNumbers(max);

        //Adding the numbers to the array
        for (int i=0; i < max; i++){
            System.out.println("What number would u like to add? (" + (i+1) + ")");
            int n = userInput.nextInt();
            num.add(n,i);
        }

        //Sorting the array
        num.sort();
    }
}
