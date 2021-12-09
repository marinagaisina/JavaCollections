package com.marinagaisina;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Wrapper<Integer> intWrapper = new Wrapper<>(25);
//        Wrapper<Double> doubleWrapper = new Wrapper<>(52.0);
//        Wrapper<Scanner> scannerWrapper = new Wrapper<>(new Scanner(System.in));
//
//        Wrapper<Wrapper<Long>> longWrapper = new Wrapper<>(new Wrapper<>(200L));
//        System.out.println(longWrapper);
        ArrayList<Integer> myArrayList = new ArrayList<>(100);
        for (int i=0; i<100; i++) {
            myArrayList.add(i);
        }
        System.out.println(myArrayList.contains(80));
        boolean r = myArrayList.remove((Integer) 80);
        System.out.println(r);
        System.out.println(myArrayList);
    }
}
