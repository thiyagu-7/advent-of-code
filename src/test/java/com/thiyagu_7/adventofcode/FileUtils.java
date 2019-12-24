package com.thiyagu_7.adventofcode;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtils {
    public static List<String> readFile(String resourcePath) {
        try {
            return Files.readAllLines(Paths.get(FileUtils.class
                    .getResource(resourcePath)
                    .toURI()));
        } catch (URISyntaxException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
