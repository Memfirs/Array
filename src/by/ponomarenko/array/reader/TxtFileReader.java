package by.ponomarenko.array.reader;

import by.ponomarenko.array.exception.ArrayCustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class TxtFileReader {

    private static Logger logger = LogManager.getLogger();

    public List<String> readFromTxt() throws ArrayCustomException {
        String fileName = "resources\\data\\textData.txt";
        List<String> dataList;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName))) {
            dataList = reader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new ArrayCustomException("File not found or damaged.");
        }

        if (dataList.isEmpty()) {
            throw new ArrayCustomException("File is empty.");
        }

        logger.log(Level.INFO, "Data was read successfully.");
        return dataList;
    }
}