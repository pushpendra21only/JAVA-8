package com.example.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8Application {

	public static void main(String[] args) {
		SpringApplication.run(Java8Application.class, args);
		
		
		System.out.println("Fruites stream : " + getStream().collect(Collectors.toList()));
		 
        // filter 1
        Predicate<String> nofruitWordFilter = name -> !name.contains("fruit");
 
        // filter 2
        Predicate<String> noLetterOFilter = name -> !name.contains("o");
 
        // to remove the fruites with word "fruit" and with letter "o".
        List<String> result = getStream().filter(nofruitWordFilter)
                .filter(noLetterOFilter)
                .collect(Collectors.toList());
 
        // printing the final result
        System.out.println("Final result : " + result);
 
    }
 
    // creating the stream of strings.
    private static Stream<String> getStream() {
        Stream<String> fruitesStream = Stream.of("mango", "grapes", "apple", "papaya", "jack fruit", "dragon fruit");
        return fruitesStream;
 
    }
	}


