package com.se;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RandmizeNumber randmizeNumber= new RandmizeNumber();
        randmizeNumber.randomize();
        int lucky=randmizeNumber.isLucky(30);
        System.out.println("You are luck for "+lucky+" times");
    }
}
