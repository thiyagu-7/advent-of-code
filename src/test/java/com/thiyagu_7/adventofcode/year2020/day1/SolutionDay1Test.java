package com.thiyagu_7.adventofcode.year2020.day1;

import org.junit.Test;

import java.util.Arrays;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay1Test {
    private static final String FILE_PATH = "/year2020/day1/input.txt";

    private SolutionDay1 solutionDay1 = new SolutionDay1();

    @Test
    public void part1_simple_test() {
        assertEquals(514579, solutionDay1.part1(Arrays.asList("1721", "979", "366", "299", "675", "1456")));
    }

    @Test
    public void test_part1() {
        assertEquals(482811, solutionDay1.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(241861950, solutionDay1.part2(Arrays.asList("1721", "979", "366", "299", "675", "1456")));
    }

    @Test
    public void test_part2() {
        assertEquals(193171814, solutionDay1.part2(readFile(FILE_PATH)));
    }
}