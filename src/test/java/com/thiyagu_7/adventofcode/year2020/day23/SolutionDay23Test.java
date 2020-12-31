package com.thiyagu_7.adventofcode.year2020.day23;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class SolutionDay23Test {
    private SolutionDay23 solutionDay23 = new SolutionDay23();
    private SolutionDay23Part2 solutionDay23Part2 = new SolutionDay23Part2();

    @Test
    public void part1_simple_test() {
        assertEquals("92658374", solutionDay23.part1(Arrays.asList(3, 8, 9, 1, 2, 5, 4, 6, 7), 10));
    }

    @Test
    public void test_part1() {
        assertEquals("97342568", solutionDay23.part1(Arrays.asList(9, 5, 2, 4, 3, 8, 7, 1, 6), 100));
    }

    @Test
    public void part2_simple_test() {
        //assertEquals("92658374", solutionDay23Part2.part2(Arrays.asList(3, 8, 9, 1, 2, 5, 4, 6, 7), 10));

        List<Integer> input = Stream.concat(Stream.of(3, 8, 9, 1, 2, 5, 4, 6, 7), IntStream.rangeClosed(10, 1_000_000)
                .boxed())
                .collect(Collectors.toList());
        assertEquals(149245887792L, solutionDay23Part2.part2(input, 10_000_000, 1_000_000));
    }


    @Test
    public void test_part2() {
        List<Integer> input = Stream.concat(Stream.of(9, 5, 2, 4, 3, 8, 7, 1, 6), IntStream.rangeClosed(10, 1_000_000)
                .boxed())
                .collect(Collectors.toList());
        assertEquals(902208073192L, solutionDay23Part2.part2(input, 10_000_000, 1_000_000));
    }

}