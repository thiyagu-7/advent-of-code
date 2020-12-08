package com.thiyagu_7.adventofcode.year2020.day2;

import org.junit.Test;

import java.util.Arrays;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay2Test {
    private static final String FILE_PATH = "/year2020/day2/input.txt";

    private SolutionDay2 solutionDay2 = new SolutionDay2();

    @Test
    public void part1_simple_test() {
        assertEquals(2, solutionDay2.part1(Arrays.asList(
                "1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc")
        ));
    }

    @Test
    public void test_part1() {
        assertEquals(628, solutionDay2.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(1, solutionDay2.part2(Arrays.asList(
                "1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc")
        ));
    }

    @Test
    public void test_part2() {
        assertEquals(705, solutionDay2.part2(readFile(FILE_PATH)));
    }
}