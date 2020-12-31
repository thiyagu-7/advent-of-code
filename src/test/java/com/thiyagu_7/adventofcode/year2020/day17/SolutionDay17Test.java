package com.thiyagu_7.adventofcode.year2020.day17;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay17Test {

    private static final String FILE_PATH_SAMPLE = "/year2020/day17/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day17/input.txt";

    private SolutionDay17 solutionDay17 = new SolutionDay17();
    private SolutionDay17Part2 solutionDay17Part2 = new SolutionDay17Part2();

    @Test
    public void part1_simple_test() {
        assertEquals(112, solutionDay17.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(211, solutionDay17.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(848, solutionDay17Part2.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(1952, solutionDay17Part2.part2(readFile(FILE_PATH)));
    }
}