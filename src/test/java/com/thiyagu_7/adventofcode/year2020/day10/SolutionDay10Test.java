package com.thiyagu_7.adventofcode.year2020.day10;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay10Test {
    private static final String FILE_PATH_SAMPLE1 = "/year2020/day10/sample-input1.txt";
    private static final String FILE_PATH_SAMPLE2 = "/year2020/day10/sample-input2.txt";
    private static final String FILE_PATH = "/year2020/day10/input.txt";

    private SolutionDay10 solutionDay10 = new SolutionDay10();

    @Test
    public void part1_simple_test() {
        Map<Integer, Integer> differencesCount = new HashMap<>();
        differencesCount.put(1, 7);
        differencesCount.put(3, 5);
        assertEquals(differencesCount, solutionDay10.findAllDifferences(readFile(FILE_PATH_SAMPLE1)));

        differencesCount = new HashMap<>();
        differencesCount.put(1, 22);
        differencesCount.put(3, 10);
        assertEquals(differencesCount, solutionDay10.findAllDifferences(readFile(FILE_PATH_SAMPLE2)));
    }

    @Test
    public void test_part1() {
        assertEquals(1690, solutionDay10.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(8, solutionDay10.part2(readFile(FILE_PATH_SAMPLE1)));

        assertEquals(19208, solutionDay10.part2(readFile(FILE_PATH_SAMPLE2)));
    }

    @Test
    public void test_part2() {
        assertEquals(5289227976704L, solutionDay10.part2(readFile(FILE_PATH)));
    }

}