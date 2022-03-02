package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList arr = new ArrayList();
    for (int i = 0; i < 10; i++) {
        arr.add(i);
    }
    swap(arr ,5, 8);
        for (Object o:arr
             ) {
            System.out.println(o);

        }
    }

    static void swap(ArrayList arr,int i1,int i2){
       Object f1 = arr.get(i1);
       Object f2 = arr.get(i2);
       arr.set(i1,f2);
        arr.set(i2,f1);
    }
}
