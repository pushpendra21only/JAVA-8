package com.example.java8.stream;
import java.util.List;
import java.util.Arrays;

public class AllNumbersStartWith1 {
public static void main(String args[]) {
/*
The map method is used to return a stream consisting of the results of applying
  the given function to the elements of this stream

   Stream map(Function mapper) is an intermediate operation. These operations are always lazy.

   Intermediate operations are invoked on a Stream instance and after they finish their processing,
   they give a Stream instance as output.

 */
    List<Integer> numbers = Arrays.asList(0,15,8,49,25,98,32);

    numbers.stream().map(s->s+"") //convert integer to string
            .filter(s->s.startsWith("1")).forEach(System.out::println);

}
}
