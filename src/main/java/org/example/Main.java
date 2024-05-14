package org.example;

import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        for (long i = 2; i < Long.MAX_VALUE; i++) {
            if (getDel(i).stream().reduce(0L, Long::sum) == i) {
                System.out.println(i);
            }
        }
    }

    public static List<Long> getDel(long d) {
        List<Long> list = new LinkedList<>();
        int j = 0;
        while (j < 10) {
            list.add((long) j);
            j++;
        }
        for (long i = 1; i < d; i++) {
            if (d % i == 0) {
                list.add(i);
            }
        }
        return list;
    }
}

/**
 * for (long i = 1; i < d; i++) {
 *             if (d % i == 0) {
 *                 list.add(i);
 *             }
 *         }
 */