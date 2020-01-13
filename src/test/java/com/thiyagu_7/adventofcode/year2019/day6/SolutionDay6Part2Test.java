package com.thiyagu_7.adventofcode.year2019.day6;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay6Part2Test {
    private SolutionDay6Part2 solutionDay6Part2 = new SolutionDay6Part2();

    @Test
    public void test_part2_simple() {
        List<String> input = Arrays.asList("COM)B","B)C","C)D","D)E","E)F","B)G","G)H","D)I","E)J","J)K","K)L","K)YOU","I)SAN");
        assertEquals(4, solutionDay6Part2.part2(input));
    }

    @Test
    public void test_part2() {
        List<String> input = readFile("/year2019/day6/input.txt");
        assertEquals(436, solutionDay6Part2.part2(input));
    }
}