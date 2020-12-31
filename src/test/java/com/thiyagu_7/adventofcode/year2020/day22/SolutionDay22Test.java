package com.thiyagu_7.adventofcode.year2020.day22;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionDay22Test {
    private SolutionDay22 solutionDay22 = new SolutionDay22();

    @Test
    public void part1_simple_test() {
        assertEquals(306, solutionDay22.part1(new ArrayList<>(Arrays.asList(9, 2, 6, 3, 1)),
                new ArrayList<>(Arrays.asList(5, 8, 4, 7, 10))));
    }

    @Test
    public void test_part1() {
        assertEquals(32598, solutionDay22.part1(new ArrayList<>(Arrays.asList(44,24,36,6,27,46,33,45,47,41,15,23,40,38,43,42,25,5,30,35,34,13,29,1,50)),
                new ArrayList<>(Arrays.asList(32,28,4,12,9,21,48,18,31,39,20,16,3,37,49,7,17,22,8,26,2,14,11,19,10))));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(291, solutionDay22.part2(new ArrayList<>(Arrays.asList(9, 2, 6, 3, 1)),
                new ArrayList<>(Arrays.asList(5, 8, 4, 7, 10))));

        assertEquals(105, solutionDay22.part2(new ArrayList<>(Arrays.asList(43, 19)),
                new ArrayList<>(Arrays.asList(2, 29, 14))));
    }

    @Test
    public void part2() {
        assertEquals(35836, solutionDay22.part2(new ArrayList<>(Arrays.asList(44,24,36,6,27,46,33,45,47,41,15,23,40,38,43,42,25,5,30,35,34,13,29,1,50)),
                new ArrayList<>(Arrays.asList(32,28,4,12,9,21,48,18,31,39,20,16,3,37,49,7,17,22,8,26,2,14,11,19,10))));    }
}