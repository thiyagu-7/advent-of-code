package com.thiyagu_7.adventofcode.year2019.day4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionDay4Test {
    private SolutionDay4 solutionDay4 = new SolutionDay4();

    @Test
    public void test_part1_simple() {
        assertEquals(0, solutionDay4.part1(223450, 223450));
        assertEquals(0, solutionDay4.part1(123789, 123789));
        assertEquals(1, solutionDay4.part1(111111, 111111));
    }

    @Test
    public void test_part1() {
        assertEquals(1665, solutionDay4.part1(158126, 624574));
    }

    @Test
    public void test_part2_simple() {
        assertEquals(1, solutionDay4.part2(112233, 112233));
        assertEquals(0, solutionDay4.part2(123444, 123444));
        assertEquals(1, solutionDay4.part2(111122, 111122));
    }

    @Test
    public void test_part2() {
        assertEquals(1131, solutionDay4.part2(158126, 624574));
    }
}