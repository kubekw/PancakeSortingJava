package com.company;

import java.util.Arrays;

public class PanecakeSorterTester {

    public static void main(String[] args) {


        int[] myTestArray = initilRandomArray5To20Elements();
        fillArrayWithRandomNumbersInRange0to100(myTestArray);
        System.out.println(Arrays.toString(myTestArray));

        PanecakeSorter.pancakeSorting(myTestArray);

        System.out.println(Arrays.toString(myTestArray));
    }



    private static int[] initilRandomArray5To20Elements(){
        int randomArraylenght =(int) (Math.random()*15+5);
        int[] array = new int[randomArraylenght];
        return array;
    }

    public static int[] fillArrayWithRandomNumbersInRange0to100(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumberInRange0to100();
        }
        return array;
    }

    private static int randomNumberInRange0to100() {
        int randomNumber = (int) (Math.random() * 100);
        return randomNumber;
    }
}
