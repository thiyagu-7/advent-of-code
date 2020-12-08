package com.thiyagu_7.adventofcode.year2020.day6;

import org.junit.Test;


import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay6Test {
    private static final String SAMPLE_FILE_PATH = "/year2020/day6/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day6/input.txt";

    private SolutionDay6 solutionDay6 = new SolutionDay6();

    @Test
    public void part1_simple_test() {
        assertEquals(11, solutionDay6.part1(readFile(SAMPLE_FILE_PATH)));

    }

    @Test
    public void part1() {
        assertEquals(6662, solutionDay6.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(6, solutionDay6.part2(readFile(SAMPLE_FILE_PATH)));

    }

    @Test
    public void part2() {
        assertEquals(3382, solutionDay6.part2(readFile(FILE_PATH)));
    }
}