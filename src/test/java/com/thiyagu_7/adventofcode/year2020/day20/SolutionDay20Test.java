package com.thiyagu_7.adventofcode.year2020.day20;

import org.junit.Test;

import java.util.Arrays;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay20Test {
    private static final String FILE_PATH_SAMPLE = "/year2020/day20/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day20/input.txt";

    private SolutionDay20 solutionDay20 = new SolutionDay20();
    private SolutionDay20Part2 solutionDay20Part2 = new SolutionDay20Part2();

    @Test
    public void part1_simple_test() {
        assertEquals(20899048083289L, solutionDay20.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(111936085519519L, solutionDay20.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(273, solutionDay20Part2.part2(readFile(FILE_PATH_SAMPLE),
                Arrays.asList("1951", "2971", "3079", "1171")//from part 1
                , 3));
    }

    @Test
    public void test_part2() {
        assertEquals(1792, solutionDay20Part2.part2(readFile(FILE_PATH),
                Arrays.asList("3517", "2797", "3167", "3593")//from part 1
                , 12));
    }
}