package com.thiyagu_7.adventofcode.year2020.day21;

import org.junit.Test;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay21Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day21/sample-input.txt";
    private static final String FILE_PATH= "/year2020/day21/input.txt";

    private SolutionDay21 solutionDay21 = new SolutionDay21();

    @Test
    public void part1_simple_test() {
        assertEquals(5, solutionDay21.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(2317, solutionDay21.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals("mxmxvkd,sqjhc,fvjkl", solutionDay21.part2(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void part2() {
        assertEquals("kbdgs,sqvv,slkfgq,vgnj,brdd,tpd,csfmb,lrnz", solutionDay21.part2(readFile(FILE_PATH)));
    }
}