package org.gferon;

import java.util.Arrays;
import java.util.List;

public class LambdaTest {

    public void printList() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
