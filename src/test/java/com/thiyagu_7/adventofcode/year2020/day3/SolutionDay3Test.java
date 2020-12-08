package com.thiyagu_7.adventofcode.year2020.day3;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay3Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day3/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day3/input.txt";

    private SolutionDay3 solutionDay3 = new SolutionDay3();

    @Test
    public void part1_simple_test() {
        assertEquals(7, solutionDay3.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(294, solutionDay3.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(336, solutionDay3.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(5774564250L, solutionDay3.part2(readFile(FILE_PATH)));
    }
}