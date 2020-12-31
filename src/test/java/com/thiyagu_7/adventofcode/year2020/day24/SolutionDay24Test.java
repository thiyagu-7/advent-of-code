package com.thiyagu_7.adventofcode.year2020.day24;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay24Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day24/sample-input.txt";
    private static final String FILE_PATH= "/year2020/day24/input.txt";

    private SolutionDay24 solutionDay24 = new SolutionDay24();

    @Test
    public void part1_simple_test() {
        assertEquals(10, solutionDay24.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(436, solutionDay24.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(2208, solutionDay24.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(4133, solutionDay24.part2(readFile(FILE_PATH)));
    }
}