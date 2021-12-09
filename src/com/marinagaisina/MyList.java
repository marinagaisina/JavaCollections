package com.marinagaisina;

import java.util.LinkedList;
import java.util.Scanner;

public class MyList {
    public static void main(String[] args) {
        Scanner ui = new Scanner(System.in);
        LinkedList<Integer> myList = new LinkedList<>();

        int n = ui.nextInt();
        for(int i=0; i<n;i++) {
            int temp = ui.nextInt();
            myList.add(temp);
        }
        int Q = ui.nextInt();
        for(int i=0; i<Q; i++) {
            String insert = ui.next();
            int x = ui.nextInt();
            if(insert.equals("Insert")) {
                int y = ui.nextInt();
                myList.add(x,y);
            } else {
                myList.remove(x);
            }
        }
        for(int i: myList) {
            System.out.print(i+" ");
        }
    }
}
