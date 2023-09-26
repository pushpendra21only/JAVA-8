package com.example.java8.stream;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharInStringUsingStream {

public static void main(String args[]) {

    String input = "Java articles are Awesome";

    Character result = input.chars()//stream of string
            .mapToObj(s->Character.toLowerCase(Character.valueOf((char)s)))
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new ,Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry->entry.getValue()==1L)
            .map(entry->entry.getKey())
            .findFirst()
            .get();
    System.out.println("non repeatable char "+result);





}

}
