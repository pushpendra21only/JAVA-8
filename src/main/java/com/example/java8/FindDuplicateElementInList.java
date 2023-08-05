package com.example.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementInList {


    public static void main(String args[]) {

        List<Integer>  numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set set = new HashSet();
        // set add method will return false if element already present in set
        // add method purpose is to add if added successfully wil return true.
//        System.out.println("set return" + set.add(10));
//        System.out.println("set return" + set.add(15));
//        System.out.println("set return" + set.add(10));

        // this will return duplicate element

        numbers.stream().filter(n-> !set.add(n)).forEach(System.out::println);
    }
}
