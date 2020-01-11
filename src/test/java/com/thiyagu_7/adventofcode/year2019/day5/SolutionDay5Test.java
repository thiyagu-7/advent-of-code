package com.thiyagu_7.adventofcode.year2019.day5;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay5Test {
    private SolutionDay5 solutionDay5 = new SolutionDay5();

    @Test
    public void test_part1_simple() {
        int[] inputs = new int[]{1002, 4, 3, 4, 33};
        solutionDay5.part1(inputs);
        assertEquals(99, inputs[4]);
    }

    @Test
    public void test_part1() {
        assertEquals(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 6761139), solutionDay5.part1(getInputs()));
    }

    private int[] getInputs() {
        List<String> lines = readFile("/year2019/day5/input.txt");
        //file has one line only
        return Arrays.stream(lines.get(0).split(","))
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}