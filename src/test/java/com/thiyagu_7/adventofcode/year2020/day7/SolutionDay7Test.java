package com.thiyagu_7.adventofcode.year2020.day7;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay7Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day7/sample-input.txt";
    private static final String FILE_PATH_SAMPLE2 = "/year2020/day7/sample-input2.txt";

    private static final String FILE_PATH = "/year2020/day7/input.txt";

    private SolutionDay7 solutionDay7 = new SolutionDay7();

    @Test
    public void part1_simple_test() {
        assertEquals(4, solutionDay7.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(242, solutionDay7.part1(readFile(FILE_PATH)));
    }


    @Test
    public void part2_simple_test1() {
        assertEquals(32, solutionDay7.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void part2_simple_test2() {
        assertEquals(126, solutionDay7.part2(readFile(FILE_PATH_SAMPLE2)));
    }

    @Test
    public void test_part2() {
        assertEquals(176035, solutionDay7.part2(readFile(FILE_PATH)));
    }
}