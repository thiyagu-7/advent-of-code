package com.thiyagu_7.adventofcode.year2020.day14;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay14Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day14/sample-input.txt";
    private static final String FILE_PATH_SAMPLE2 = "/year2020/day14/sample-input2.txt";
    private static final String FILE_PATH = "/year2020/day14/input.txt";

    private SolutionDay14 solutionDay14 = new SolutionDay14();
    private SolutionDay14Part2 solutionDay14Part2 = new SolutionDay14Part2();

    @Test
    public void part1_simple_test() {
        assertEquals(165, solutionDay14.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(9615006043476L, solutionDay14.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(208, solutionDay14Part2.part2(readFile(FILE_PATH_SAMPLE2)));
    }

    @Test
    public void test_part2() {
        assertEquals(4275496544925L, solutionDay14Part2.part2(readFile(FILE_PATH)));
    }
}