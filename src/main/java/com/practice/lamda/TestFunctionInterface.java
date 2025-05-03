package com.practice.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

class FunctionImpl implements Function<List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> integers) {
        return integers.stream().sorted(Collections.reverseOrder()).toList();
    }
}
class BiFunctionImpl implements BiFunction<List<Integer>, List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> intLst1, List<Integer> intLst2) {
        return Stream.of(intLst1, intLst2).flatMap(List::stream).distinct().toList();
    }
}

public class TestFunctionInterface {
    public static void main(String[] args) {
        List<Integer> unsortedList = Arrays.asList(23, 4, 7, 20, 3, 7, 11, 47);
        List<Integer> unsortedList2 = Arrays.asList(57, 1, 2, 6, 79, 36, 18, 100);
        FunctionImpl functionImpl = new FunctionImpl();
        System.out.println(functionImpl.apply(unsortedList));
        Function<List<Integer>, List<Integer>> functionInterface = (unsortedLst) -> unsortedLst.stream().sorted().toList();
        System.out.println(functionInterface.apply(unsortedList));

        BiFunctionImpl biFunctionImpl = new BiFunctionImpl();
        System.out.println(biFunctionImpl.andThen(functionInterface).apply(unsortedList, unsortedList2));
    }
}
