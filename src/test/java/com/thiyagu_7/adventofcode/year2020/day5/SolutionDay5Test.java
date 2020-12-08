package com.thiyagu_7.adventofcode.year2020.day5;

import org.junit.Test;

import java.util.Collections;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay5Test {

    private static final String FILE_PATH = "/year2020/day5/input.txt";

    private SolutionDay5 solutionDay5 = new SolutionDay5();

    @Test
    public void part1_simple_test() {
        assertEquals(567, solutionDay5.part1(Collections.singletonList("BFFFBBFRRR")));
        assertEquals(119, solutionDay5.part1(Collections.singletonList("FFFBBBFRRR")));
        assertEquals(820, solutionDay5.part1(Collections.singletonList("BBFFBBFRLL")));

    }

    @Test
    public void part1() {
        assertEquals(855, solutionDay5.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2() {
        assertEquals(552, solutionDay5.part2(readFile(FILE_PATH)));
    }
}