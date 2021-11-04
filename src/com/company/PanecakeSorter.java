package com.company;

public class PanecakeSorter {

    public static int[] pancakeSorting(int[] array) {
        for (int i = array.length-1; i >=0 ; i--) {
            flipArray(array,findIndexOfMaximumValueOfArrayInRange(array,i));
            flipArray(array,i);
        }
        return array;
    }

    private static void flipArray(int[] array, int subArrayEndIndex) {
        int subArrayStartIndex = 0;
        int temp =0;

        while(subArrayStartIndex<subArrayEndIndex){
            temp=array[subArrayStartIndex];
            array[subArrayStartIndex]=array[subArrayEndIndex];
            array[subArrayEndIndex]=temp;
            subArrayStartIndex++;
            subArrayEndIndex--;
        }

    }

    private static int findIndexOfMaximumValueOfArrayInRange(int[] array, int range) {
        int indexOfmaximumValue = 0;

        for (int i = 0; i <= range; i++) {
            if(array[i]>array[indexOfmaximumValue]){
                indexOfmaximumValue = i;
            }
        }
        return indexOfmaximumValue;
    }

}
