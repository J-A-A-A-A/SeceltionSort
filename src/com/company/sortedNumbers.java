package com.company;

public class sortedNumbers {
    int[] numbers;

    public sortedNumbers(int maxsize){
        numbers = new int[maxsize];
    }

    public void add(int c,int i) {
        numbers[i] = c;
    }

    public void sort(){
        int min;
        int minPosition = 0;
        boolean swapped;

        for (int startingPos = 0; startingPos < numbers.length; startingPos++) {
            min = numbers[startingPos];
            swapped = false;
            for (int searchPos = startingPos; searchPos < numbers.length; searchPos++) {
                if (numbers[searchPos] < min) {
                    min = numbers[searchPos];
                    minPosition = searchPos;
                    swapped = true;
                }
            }
            if (swapped) {
                numbers[minPosition] = numbers[startingPos];
                numbers[startingPos] = min;
            }
        }
        for(int x : numbers){
            System.out.println(x);
        }
    }
}