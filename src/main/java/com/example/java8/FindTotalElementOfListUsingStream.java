package com.example.java8;
import java.util.List;
import java.util.Arrays;
public class FindTotalElementOfListUsingStream {

    public static void main(String args[]) {
/*
    long count() returns the count of elements in the stream.
     This is a special case of a reduction (A reduction operation takes a sequence of input elements and combines them
     into a single summary result by repeated application of a combining operation). This is a terminal operation i.e,
     it may traverse the stream to produce a result or a side-effect. After the terminal operation is performed,
     the stream pipeline is considered consumed, and can no longer be used.
*/
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        long count =numbers.stream().count();
        System.out.println("Total Element ="+count);
    }

}
