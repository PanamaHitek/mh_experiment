package com.panamahitek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThestOf3 {

    public static void main(String[] args) {
        List<Integer> oneList = new ArrayList<>();
        List<Integer> twoList = new ArrayList<>();
        List<Integer> threeList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 3; i < 100000; i++) {
            oneList.clear();
            twoList.clear();
            threeList.clear();
            for (int j = 0; j < i; j++) {
                int n = rand.nextInt(3) + 1;

                if (n == 1) {
                    oneList.add(n);
                }
                if (n == 2) {
                    twoList.add(n);
                }
                if (n == 3) {
                    threeList.add(n);
                }
            }
            long sum = oneList.size() + twoList.size() + threeList.size();
            double p1 = (oneList.size()) * Math.pow(sum, -1) * 100;
            double p2 = (twoList.size()) * Math.pow(sum, -1) * 100;
            double p3 = (threeList.size()) * Math.pow(sum, -1) * 100;

            if ((p1 >= p2) && (p1 >= p3)) {
                System.out.println(p1);
            } else if ((p2 >= p1) && (p2 >= p3)) {
                System.out.println(p2);
            } else if ((p3 >= p1) && (p3 >= p2)) {
                System.out.println(p3);
            }

        }

    }

}
