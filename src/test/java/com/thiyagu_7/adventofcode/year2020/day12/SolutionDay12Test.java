package com.thiyagu_7.adventofcode.year2020.day12;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay12Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day12/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day12/input.txt";

    private SolutionDay12 solutionDay12 = new SolutionDay12();
    private SolutionDay12Part2 solutionDay12Part2 = new SolutionDay12Part2();

    @Test
    public void part1_simple_test() {
        assertEquals(25, solutionDay12.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(2228, solutionDay12.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(286, solutionDay12Part2.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(42908, solutionDay12Part2.part2(readFile(FILE_PATH)));
    }
}