package com.arthur;

import com.arthur.arrayList.ReaList;

public class Main {
    public static void main(String[] args) {

        ReaList<String> myList = new ReaList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");

        myList.remove(4);
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

        myList.set(1 , "10");
        System.out.println(myList.get(1));
//        System.out.println(myList.get(4));

        System.out.println(myList.findFirst());
        System.out.println(myList.findLast());

    }
}