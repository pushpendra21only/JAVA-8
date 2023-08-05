package com.example.java8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElementInListAndGreaterThan15 {


    public static void main(String args[]) {

        List<Integer>  numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set set = new HashSet();
        numbers.stream().filter(
                (n)->
                            {
                                return (!set.add(n) && n>15);
                            }

                            ).forEach(System.out::println);
    }
}
