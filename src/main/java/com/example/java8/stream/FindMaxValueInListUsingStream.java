package com.example.java8.stream;
import java.util.List;
import java.util.Arrays;

public class FindMaxValueInListUsingStream {

    public static void main(String args[]) {
        //max() is a special case of reduction
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        int max = numbers.stream().max(Integer::compare).get();
        System.out.println("max = "+max);

    }


}
