package com.thiyagu_7.adventofcode.year2019.day1;

import org.junit.Test;

import java.util.Collections;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay1Test {
    private static final String FILE_PATH = "/year2019/day1/input.txt";

    private SolutionDay1 solutionDay1 = new SolutionDay1();

    @Test
    public void part1_simple_test() {
        assertEquals(2, solutionDay1.part1(Collections.singletonList("12")));
    }

    @Test
    public void part1_requiring_rounding() {
        assertEquals(2, solutionDay1.part1(Collections.singletonList("14")));
    }

    @Test
    public void part1_big_number() {
        assertEquals(33583, solutionDay1.part1(Collections.singletonList("100756")));
    }

    @Test
    public void test_part1() {
        assertEquals(3393938, solutionDay1.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(2, solutionDay1.part2(Collections.singletonList("14")));
    }

    @Test
    public void part2_big_number() {
        assertEquals(50346, solutionDay1.part2(Collections.singletonList("100756")));
    }

    @Test
    public void test_part2() {
        assertEquals(5088037, solutionDay1.part2(readFile(FILE_PATH)));
    }

}