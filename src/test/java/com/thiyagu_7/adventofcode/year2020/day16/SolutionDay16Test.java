package com.thiyagu_7.adventofcode.year2020.day16;

import org.junit.Test;

import java.util.Arrays;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay16Test {

    private static final String FILE_PATH_RULES = "/year2020/day16/input-rules.txt";
    private static final String FILE_PATH_NEARBY_TICKETS= "/year2020/day16/input-nearby-tickets.txt";
    private SolutionDay16 solutionDay16 = new SolutionDay16();

    private SolutionDay16Part2 solutionDay16Part2 = new SolutionDay16Part2();

    @Test
    public void part1_simple_test() {
        assertEquals(71, solutionDay16.part1(
                Arrays.asList("class: 1-3 or 5-7", "row: 6-11 or 33-44", "seat: 13-40 or 45-50"),
                Arrays.asList("7,3,47", "40,4,50", "55,2,20", "38,6,12")));
    }

    @Test
    public void test_part1() {
        assertEquals(25961, solutionDay16.part1(readFile(FILE_PATH_RULES), readFile(FILE_PATH_NEARBY_TICKETS)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(1, solutionDay16Part2.part2(
                Arrays.asList("class: 0-1 or 4-19", "row: 0-5 or 8-19", "seat: 0-13 or 16-19"),
                "11,12,13",
                Arrays.asList("3,9,18", "15,1,5", "5,14,19")));
    }

    @Test
    public void test_part2() {
        assertEquals(603409823791L, solutionDay16Part2.part2(
                readFile(FILE_PATH_RULES),
                "53,101,83,151,127,131,103,61,73,71,97,89,113,67,149,163,139,59,79,137",
                readFile(FILE_PATH_NEARBY_TICKETS)));
    }
}