package com.thiyagu_7.adventofcode.year2019.day5;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.assertArrayEquals;
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

    @Test
    public void test_part2_simple_equal_position_mode() {
        int[] inputs = new int[]{3, 9, 8, 9, 10, 9, 4, 9, 99, -1, 8};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 9, 8, 9, 10, 9, 4, 9, 99, 1, 8};
        assertEquals(Collections.singletonList(1), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_simple_less_than_position_mode() {
        int[] inputs = new int[]{3, 9, 7, 9, 10, 9, 4, 9, 99, -1, 8};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 9, 7, 9, 10, 9, 4, 9, 99, 0, 8};
        assertEquals(Collections.singletonList(0), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_simple_equal_immediate_mode() {
        int[] inputs = new int[]{3, 3, 1108, -1, 8, 3, 4, 3, 99};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 3, 1108, 1, 8, 3, 4, 3, 99};
        assertEquals(Collections.singletonList(1), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_simple_less_than_immediate_mode() {
        int[] inputs = new int[]{3, 3, 1107, -1, 8, 3, 4, 3, 99};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 3, 1107, 0, 8, 3, 4, 3, 99};
        assertEquals(Collections.singletonList(0), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_jump_position_mode() {
        int[] inputs = new int[]{3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, -1, 0, 1, 9};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 12, 6, 12, 15, 1, 13, 14, 13, 4, 13, 99, 8, 1, 1, 9};
        assertEquals(Collections.singletonList(1), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_jump_immediate_mode() {
        int[] inputs = new int[]{3, 3, 1105, -1, 9, 1101, 0, 0, 12, 4, 12, 99, 1};
        List<Integer> writtenValues = solutionDay5.part2(inputs, 8);
        int[] finalInputs = new int[]{3, 3, 1105, 8, 9, 1101, 0, 0, 12, 4, 12, 99, 1};
        assertEquals(Collections.singletonList(1), writtenValues);
        assertArrayEquals(finalInputs, inputs);
    }

    @Test
    public void test_part2_large_example() {
        int[] inputs = new int[]{3, 21, 1008, 21, 8, 20, 1005, 20, 22, 107, 8, 21, 20, 1006, 20, 31,
                1106, 0, 36, 98, 0, 0, 1002, 21, 125, 20, 4, 20, 1105, 1, 46, 104,
                999, 1105, 1, 46, 1101, 1000, 1, 20, 4, 20, 1105, 1, 46, 98, 99};

        List<Integer> writtenValues = solutionDay5.part2(Arrays.copyOf(inputs, inputs.length), 7);
        assertEquals(Collections.singletonList(999), writtenValues);
        writtenValues = solutionDay5.part2(Arrays.copyOf(inputs, inputs.length), 8);
        assertEquals(Collections.singletonList(1000), writtenValues);

        writtenValues = solutionDay5.part2(Arrays.copyOf(inputs, inputs.length), 9);
        assertEquals(Collections.singletonList(1001), writtenValues);
    }

    @Test
    public void test_part2() {
        assertEquals(Collections.singletonList(9217546), solutionDay5.part2(getInputs(), 5));
    }

    private int[] getInputs() {
        List<String> lines = readFile("/year2019/day5/input.txt");
        //file has one line only
        return Arrays.stream(lines.get(0).split(","))
                .mapToInt(Integer::valueOf)
                .toArray();
    }
}