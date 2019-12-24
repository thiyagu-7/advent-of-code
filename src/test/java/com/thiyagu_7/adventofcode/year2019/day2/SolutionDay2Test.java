package com.thiyagu_7.adventofcode.year2019.day2;

import com.thiyagu_7.adventofcode.FileUtils;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertEquals;

public class SolutionDay2Test {
    private SolutionDay2 solutionDay2 = new SolutionDay2();

    @Test
    public void test_part1_simple_input() {
        assertEquals(2, solutionDay2.part1(new int[]{1, 0, 0, 0, 99}));
        assertEquals(2, solutionDay2.part1(new int[]{2, 3, 0, 3, 99}));
        assertEquals(30, solutionDay2.part1(new int[]{1, 1, 1, 4, 99, 5, 6, 0, 99}));
    }

    @Test
    public void test_part1() {
        int[] inputs = getInputs();
        inputs[1] = 12;
        inputs[2] = 2;
        assertEquals(4570637, solutionDay2.part1(inputs));
    }

    @Test
    public void test_part2() {
        int[] inputs = getInputs();
        assertEquals(5485, solutionDay2.part2(inputs, 19690720));
    }

    private int[] getInputs() {
        List<String> lines = readFile("/year2019/day2/input.txt");
        //file has one line only
        return Arrays.stream(lines.get(0).split(","))
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}