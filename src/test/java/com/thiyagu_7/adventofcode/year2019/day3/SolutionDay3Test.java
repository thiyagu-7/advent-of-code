package com.thiyagu_7.adventofcode.year2019.day3;

import com.thiyagu_7.adventofcode.FileUtils;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SolutionDay3Test {
    private static final String FILE_PATH = "/year2019/day3/input.txt";

    private SolutionDay3 solutionDay3;

    @Test
    public void test_part1_simple() {
        solutionDay3 = new SolutionDay3();
        assertEquals(6, solutionDay3.part1("R8,U5,L5,D3", "U7,R6,D4,L4"));

        solutionDay3 = new SolutionDay3();
        assertEquals(159, solutionDay3.part1("R75,D30,R83,U83,L12,D49,R71,U7,L72", "U62,R66,U55,R34,D71,R55,D58,R83"));

        solutionDay3 = new SolutionDay3();
        assertEquals(135, solutionDay3.part1("R98,U47,R26,D63,R33,U87,L62,D20,R33,U53,R51", "U98,R91,D20,R16,D67,R40,U7,R15,U6,R7"));
    }

    @Test
    public void test_part1() {
        solutionDay3 = new SolutionDay3();
        List<String> lines = FileUtils.readFile(FILE_PATH);
        assertEquals(1674, solutionDay3.part1(lines.get(0), lines.get(1)));
    }

}