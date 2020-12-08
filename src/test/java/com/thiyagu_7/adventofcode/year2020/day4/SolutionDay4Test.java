package com.thiyagu_7.adventofcode.year2020.day4;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay4Test {

    private static final String FILE_PATH_SAMPLE = "/year2020/day4/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day4/input.txt";

    private static final String VALID_PASSPORTS_DATA = "/year2020/day4/part2-valid-passports.txt";
    private static final String INVALID_PASSPORTS_DATA = "/year2020/day4/part2-invalid-passports.txt";

    private SolutionDay4 solutionDay4 = new SolutionDay4();

    @Test
    public void part1_simple_test() {
        assertEquals(2, solutionDay4.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void part1() {
        assertEquals(182, solutionDay4.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_valid_passports() {
        assertEquals(4, solutionDay4.part2(readFile(VALID_PASSPORTS_DATA)));
    }

    @Test
    public void part2_invalid_passports() {
        assertEquals(0, solutionDay4.part2(readFile(INVALID_PASSPORTS_DATA)));
    }

    @Test
    public void part2() {
        assertEquals(109, solutionDay4.part2(readFile(FILE_PATH)));
    }
}