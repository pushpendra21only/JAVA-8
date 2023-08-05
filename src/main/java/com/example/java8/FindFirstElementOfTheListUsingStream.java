package com.example.java8;
import java.util.List;
import java.util.Arrays;
public class FindFirstElementOfTheListUsingStream {

    public static void main(String args[]) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        numbers.stream().findFirst().ifPresent(System.out::println);
    }
}
