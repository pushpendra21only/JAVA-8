package com.example.java8.stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupByAndCountAndSort {


    public static void main(String args[]) {

        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String,Long> result = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


        System.out.println("display and total count ="+result);

        Map<String,Long> finalMap = new LinkedHashMap<>();
        //Sort a map and add to finalMap
        result.entrySet().stream().sorted(Map.Entry.<String,Long> comparingByValue().reversed()).forEachOrdered(
                el->finalMap.put(el.getKey(),el.getValue()));


        System.out.println("display total count and sorted ="+finalMap);



    }
}
