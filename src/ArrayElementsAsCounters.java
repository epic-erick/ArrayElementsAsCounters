/*
* Created by Epic_ on 1/3/2018
* Creates an array of size 7, and records the frequency inside the index's
* */

import java.util.Random;

public class ArrayElementsAsCounters {
    public static void main(String[] args) {
        Random rand = new Random();
        int freq[]=new int[7];

        for(int roll=1;roll<1000;roll++){
            ++freq[1+rand.nextInt(6)]; // 1 + <-- bc if not it would pick random num between 0-5 instead of 1-6
        }

        System.out.println("Face\tFrequency");

        for(int face=1;face<freq.length;face++){
            System.out.println(face+"\t\t"+freq[face]);
        }
    }
}
