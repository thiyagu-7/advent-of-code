package com.thiyagu_7.adventofcode.year2020.day18;

import org.junit.Test;

import java.util.Collections;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay18Test {
    private static final String FILE_PATH = "/year2020/day18/input.txt";
    private SolutionDay18 solutionDay18 = new SolutionDay18();

    @Test
    public void part1_simple_test() {

        assertEquals(71, solutionDay18.part1(Collections.singletonList("1 + 2 * 3 + 4 * 5 + 6")));
        assertEquals(51, solutionDay18.part1(Collections.singletonList("1 + (2 * 3) + (4 * (5 + 6))")));
        assertEquals(26, solutionDay18.part1(Collections.singletonList("2 * 3 + (4 * 5)")));
        assertEquals(437, solutionDay18.part1(Collections.singletonList("5 + (8 * 3 + 9 + 3 * 4 * 3)")));
        assertEquals(12240, solutionDay18.part1(Collections.singletonList("5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4))")));
        assertEquals(13632, solutionDay18.part1(Collections.singletonList("((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2")));
    }

    @Test
    public void test_part1() {
        assertEquals(50956598240016L, solutionDay18.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(231, solutionDay18.part2(Collections.singletonList("1 + 2 * 3 + 4 * 5 + 6")));
        assertEquals(51, solutionDay18.part2(Collections.singletonList("1 + (2 * 3) + (4 * (5 + 6))")));
        assertEquals(46, solutionDay18.part2(Collections.singletonList("2 * 3 + (4 * 5)")));
        assertEquals(1445, solutionDay18.part2(Collections.singletonList("5 + (8 * 3 + 9 + 3 * 4 * 3)")));
        assertEquals(669060, solutionDay18.part2(Collections.singletonList("5 * 9 * (7 * 3 * 3 + 9 * 3 + (8 + 6 * 4))")));
        assertEquals(23340, solutionDay18.part2(Collections.singletonList("((2 + 4 * 9) * (6 + 9 * 8 + 6) + 6) + 2 + 4 * 2")));
    }

    @Test
    public void test_part2() {
        assertEquals(535809575344339L, solutionDay18.part2(readFile(FILE_PATH)));
    }
}