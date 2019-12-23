package com.thiyagu_7.adventofcode.year2019.day1;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionDay1Test {
    private SolutionDay1 solutionDay1 = new SolutionDay1();

    @Test
    public void part1_simple_test() {
        assertEquals(2, solutionDay1.part1(Collections.singletonList("12")));
    }

    @Test
    public void part1_requiring_rounding() {
        assertEquals(2, solutionDay1.part1(Collections.singletonList("14")));
    }

    @Test
    public void part1_big_number() {
        assertEquals(33583, solutionDay1.part1(Collections.singletonList("100756")));
    }

    @Test
    public void test_part1() {
        assertEquals(3393938, solutionDay1.part1(readInputFile()));
    }

    @Test
    public void part2_simple_test() {
        assertEquals(2, solutionDay1.part2(Collections.singletonList("14")));
    }

    @Test
    public void part2_big_number() {
        assertEquals(50346, solutionDay1.part2(Collections.singletonList("100756")));
    }

    @Test
    public void test_part2() {
        assertEquals(5088037, solutionDay1.part2(readInputFile()));
    }

    private List<String> readInputFile() {
        try {
            return Files.readAllLines(Paths.get(getClass()
                    .getResource("/year2019/day1/input.txt")
                    .toURI()));
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}