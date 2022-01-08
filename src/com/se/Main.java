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

    }
}
