package com.thiyagu_7.adventofcode.year2020.day19;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.thiyagu_7.adventofcode.FileUtils.readFile;
import static org.junit.Assert.*;

public class SolutionDay19Test {
    private static final String FILE_PATH_SAMPLE_RULES = "/year2020/day19/sample-input-rules.txt";
    private static final String FILE_PATH_SAMPLE_MESSAGES = "/year2020/day19/sample-input-messages.txt";

    private static final String FILE_PATH_SAMPLE_RULES2 = "/year2020/day19/sample-input-rules-part2.txt";
    private static final String FILE_PATH_SAMPLE_MESSAGES2 = "/year2020/day19/sample-input-messages-part2.txt";


    private static final String FILE_PATH_RULES = "/year2020/day19/input-rules.txt";
    private static final String FILE_PATH_MESSAGES = "/year2020/day19/input-messages.txt";
    private SolutionDay19 solutionDay19 = new SolutionDay19();

    @Test
    public void part1_simple_test() {
        assertEquals(2, solutionDay19.part1(readRules(readFile(FILE_PATH_SAMPLE_RULES)), readFile(FILE_PATH_SAMPLE_MESSAGES)));
    }

    @Test
    public void test_part1() {
        assertEquals(241, solutionDay19.part1(readRules(readFile(FILE_PATH_RULES)), readFile(FILE_PATH_MESSAGES)));
    }

    @Test
    public void part2_simple_test() {
        //old
       // assertEquals(3, solutionDay19.part1(readRules(readFile(FILE_PATH_SAMPLE_RULES2)), readFile(FILE_PATH_SAMPLE_MESSAGES2)));
        //after updating rules
        assertEquals(12, solutionDay19.part2(readRules(readFile(FILE_PATH_SAMPLE_RULES2)), readFile(FILE_PATH_SAMPLE_MESSAGES2)));
    }

    @Test
    public void test_part2() {
        assertEquals(424, solutionDay19.part2(readRules(readFile(FILE_PATH_RULES)), readFile(FILE_PATH_MESSAGES)));
    }

    private Map<String, String> readRules(List<String> lines) {
        return lines.stream()
                .map(line -> line.split(":"))
                .collect(Collectors.toMap(p -> p[0], p -> p[1].trim()));
    }
}