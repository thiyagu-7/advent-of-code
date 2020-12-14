package com.thiyagu_7.adventofcode.year2020.day13;

import org.junit.Test;

import java.util.Arrays;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay13Test {

    private static final String FILE_PATH_SAMPLE = "/year2020/day13/sample-input.txt";
    private static final String FILE_PATH = "/year2020/day13/input.txt";

    private SolutionDay13 solutionDay13 = new SolutionDay13();

    @Test
    public void part1_simple_test() {
        assertEquals(295, solutionDay13.part1(readFile(FILE_PATH_SAMPLE)));
    }

    @Test
    public void test_part1() {
        assertEquals(3035, solutionDay13.part1(readFile(FILE_PATH)));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(1068781, solutionDay13.part2(readFile(FILE_PATH_SAMPLE)));

        assertEquals(3417, solutionDay13.part2(Arrays.asList("", "17,x,13,19")));
        assertEquals(754018, solutionDay13.part2(Arrays.asList("", "67,7,59,61")));
        assertEquals(779210, solutionDay13.part2(Arrays.asList("", "67,x,7,59,61")));
        assertEquals(1261476, solutionDay13.part2(Arrays.asList("", "67,7,x,59,61")));
        assertEquals(1202161486, solutionDay13.part2(Arrays.asList("", "1789,37,47,1889")));
    }

    @Test
    public void test_part2() {
        assertEquals(725169163285238L, solutionDay13.part2(readFile(FILE_PATH)));
    }
}