package com.thiyagu_7.adventofcode.year2020.day11;

import org.junit.Test;


import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay11Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day11/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day11/input.txt";

    private SolutionDay11 solutionDay11 = new SolutionDay11();

    @Test
    public void part1_simple_test() {
        assertEquals(37, solutionDay11.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(2468, solutionDay11.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(26, solutionDay11.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(2214, solutionDay11.part2(readFile(FILE_PATH)));
    }
}