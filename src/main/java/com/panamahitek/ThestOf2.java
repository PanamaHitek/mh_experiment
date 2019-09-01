package com.panamahitek;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThestOf2 {

    public static void main(String[] args) {
        List<Integer> oneList = new ArrayList<>();
        List<Integer> twoList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 2; i < 100000; i++) {
            oneList.clear();
            twoList.clear();
            for (int j = 0; j < i; j++) {
                int n = rand.nextInt(2) + 1;
                if (n == 1) {
                    oneList.add(n);
                }
                if (n == 2) {
                    twoList.add(n);
                }
            }
            long sum = oneList.size() + twoList.size();
            double p1 = (oneList.size()) * Math.pow(sum, -1) * 100;
            double p2 = (twoList.size()) * Math.pow(sum, -1) * 100;

            if (p1 >= p2) {
                System.out.println(p1);
            } else if (p2 >= p1) {
                System.out.println(p2);
            }

        }

    }

}
