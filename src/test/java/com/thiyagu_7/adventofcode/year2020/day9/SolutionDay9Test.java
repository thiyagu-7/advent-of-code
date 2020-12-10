package com.thiyagu_7.adventofcode.year2020.day9;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay9Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day9/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day9/input.txt";

    private SolutionDay9 solutionDay9 = new SolutionDay9();

    @Test
    public void part1_simple_test() {
        assertEquals(127, solutionDay9.part1(readFile(FILE_PATH_SAMPLE), 5));
    }

    @Test
    public void test_part1() {
        assertEquals(90433990, solutionDay9.part1(readFile(FILE_PATH), 25));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(62, solutionDay9.part2(readFile(FILE_PATH_SAMPLE), 5));
    }

    @Test
    public void test_part2() {
        assertEquals(11691646, solutionDay9.part2(readFile(FILE_PATH), 25));
    }
}