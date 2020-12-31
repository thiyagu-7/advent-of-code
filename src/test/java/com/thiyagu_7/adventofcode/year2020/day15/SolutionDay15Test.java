package com.thiyagu_7.adventofcode.year2020.day15;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionDay15Test {

    private SolutionDay15 solutionDay15 = new SolutionDay15();

    @Test
    public void part1_simple_test() {
        assertEquals(436, solutionDay15.part1(Arrays.asList(0, 3, 6)));
        assertEquals(1, solutionDay15.part1(Arrays.asList(1,3,2)));
        assertEquals(10, solutionDay15.part1(Arrays.asList(2,1,3)));
        assertEquals(27, solutionDay15.part1(Arrays.asList(1,2,3)));
        assertEquals(78, solutionDay15.part1(Arrays.asList(2, 3, 1)));
        assertEquals(438, solutionDay15.part1(Arrays.asList(3, 2, 1)));
        assertEquals(1836, solutionDay15.part1(Arrays.asList(3, 1, 2)));
    }

    @Test
    public void test_part1() {
        assertEquals(234, solutionDay15.part1(Arrays.asList(0,13,1,16,6,17)));
    }

    @Ignore
    @Test
    public void part2_simple_test() {
        assertEquals(175594, solutionDay15.part2(Arrays.asList(0, 3, 6)));
        assertEquals(2578, solutionDay15.part2(Arrays.asList(1,3,2)));
        assertEquals(3544142, solutionDay15.part2(Arrays.asList(2,1,3)));
        assertEquals(261214, solutionDay15.part2(Arrays.asList(1,2,3)));
        assertEquals(6895259, solutionDay15.part2(Arrays.asList(2, 3, 1)));
        assertEquals(18, solutionDay15.part2(Arrays.asList(3, 2, 1)));
        assertEquals(362, solutionDay15.part2(Arrays.asList(3, 1, 2)));
    }

    @Test
    public void test_part2() {
        assertEquals(8984, solutionDay15.part2(Arrays.asList(0,13,1,16,6,17)));
    }
}