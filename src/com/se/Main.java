package com.se;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> randomNum = new ArrayList<>();
        for (int i=0;i<100;i++) {
            randomNum.add(new Random().nextInt(100));
        }
        int luckyCount=0;

        for (Integer i:randomNum) {
            if (i==50) {
                luckyCount++;
            }
        }

        System.out.println("You are lucky for "+luckyCount+" times");

    }
}
