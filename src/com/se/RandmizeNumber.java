package com.se;

import java.util.ArrayList;
import java.util.Random;

public class RandmizeNumber {
    private ArrayList<Integer> randomNum;

    public RandmizeNumber() {
        randomNum = new ArrayList<>();
    }

    public void randomize() {
        randomNum.clear();
        for (int i=0;i<100;i++) {
            randomNum.add(new Random().nextInt(100));
        }
    }

    public int isLucky(int luckyNumber) {
        int luckyCount=0;

        for (Integer i:randomNum) {
            if (i==50) {
                luckyCount++;
            }
        }
        return luckyCount;
    }
}

