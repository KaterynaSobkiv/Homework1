package Homework3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {

    public static final String INPUT_FILE_PATH = "path/to/file.txt";
    public static final String OUTPUT_FILE_PATH = "path/to/file.txt";

    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> rows = toMap(readFromFile(INPUT_FILE_PATH));
        writeToFile(OUTPUT_FILE_PATH, toListAndFilter(rows, 2));
    }

    private static List<String> toListAndFilter(HashMap<Integer, String> rows, int pow) {
        List<String> result = new ArrayList<>();

        int i = 0;
        String lastRow;

        do {
            lastRow = rows.get(Math.pow(i++, pow));

            if (Objects.nonNull(lastRow)) {
                result.add(lastRow);
            }
        } while (lastRow != null);

        return result;
    }

    public static List<String> readFromFile(String pathToFile) throws IOException {
        try (Stream<String> lines = Files.lines(Paths.get(pathToFile))) {
            return lines.collect(Collectors.toList());
        }
    }

    public static void writeToFile(String pathToFile, List<String> rows) throws IOException {
        PrintWriter writer = new PrintWriter(pathToFile);

        for (String line : rows) {
            writer.println(line);
        }

        writer.close();
    }

    public static HashMap<Integer, String> toMap(List<String> elements) {
        HashMap<Integer, String> result = new HashMap<>();

        for (int i = 0; i < elements.size(); i++) {
            result.put(i, elements.get(i));
        }

        return result;
    }
}
