package com.thiyagu_7.adventofcode.year2019.day6;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay6Test {
    private SolutionDay6 solutionDay6 = new SolutionDay6();

    @Test
    public void test_part1_simple() {
        List<String> input = Collections.singletonList("COM)B");
        assertEquals(1, solutionDay6.part1(input));
    }

    @Test
    public void test_part1_simple2() {
        List<String> input = Arrays.asList("COM)B", "B)C", "C)D");
        assertEquals(6, solutionDay6.part1(input));
    }

    @Test
    public void test_part1_simple_example() {
        List<String> input = Arrays.asList("COM)B","B)C","C)D","D)E","E)F","B)G","G)H","D)I","E)J","J)K","K)L");
        assertEquals(42, solutionDay6.part1(input));
    }

    @Test
    public void test_part1() {
        List<String> input = readFile("/year2019/day6/input.txt");
        assertEquals(344238, solutionDay6.part1(input));
    }
}