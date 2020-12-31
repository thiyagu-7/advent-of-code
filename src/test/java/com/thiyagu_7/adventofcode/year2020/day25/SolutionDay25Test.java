package com.thiyagu_7.adventofcode.year2020.day25;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionDay25Test {

    private SolutionDay25 solutionDay25 = new SolutionDay25();

    @Test
    public void part1_simple_test() {
        assertEquals(14897079L, solutionDay25.part1(5764801, 17807724));
    }

    @Test
    public void part1() {
        assertEquals(11328376L, solutionDay25.part1(10705932, 12301431));
    }
}