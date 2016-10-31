package pl.knobel.learningchalenge.javaslang;


import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


/**
 * Created by Michal Knobel on 31.10.2016.
 *
 * Source: https://www.javacodegeeks.com/2015/05/functional-programming-in-java-8-with-javaslang.html
 */
public class Demo {
  public static void main(String[] args) {

    List<Integer> list = Arrays.asList(2, 3, 1);
    // passing the comparator as lambda expression
    Collections.sort(list, (i1, i2) -> i1 - i2);

    // stream a list, sort it and collect results
    Arrays.asList(2, 3, 1)
        .stream()
        .sorted()
        .collect(Collectors.toList());

    // a little bit shorter
    Stream.of(2, 3, 1)
        .sorted()
        .collect(Collectors.toList());

    // or better use an IntStream?
    IntStream.of(2, 3, 1)
        .sorted()
        .collect(ArrayList::new, List::add, List::addAll);

    // slightly simplified
    IntStream.of(2, 3, 1)
        .sorted()
        .boxed()
        .collect(Collectors.toList());

  }
}
