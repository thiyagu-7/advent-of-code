package com.thiyagu_7.adventofcode.year2020.day8;

import com.thiyagu_7.adventofcode.year2020.day3.SolutionDay3;
import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay8Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day8/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day8/input.txt";

    private SolutionDay8 solutionDay8 = new SolutionDay8();

    @Test
    public void part1_simple_test() {
        assertEquals(5, solutionDay8.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(1489, solutionDay8.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(8, solutionDay8.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part2() {
        assertEquals(1539, solutionDay8.part2(readFile(FILE_PATH)));
    }
}