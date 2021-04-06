package by.ponomarenko.array.parser;

import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.validator.TextValidator;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataParser {

    private static Logger logger = LogManager.getLogger();

    public int[] toIntArrayParser(List<String> dataListForParsing) throws ArrayCustomException {
        TextValidator textValidator = new TextValidator();
        List<String> trueData = new ArrayList<>();
        int[] resultArray;

        for (String lineForParsing : dataListForParsing) {
            if (textValidator.intValidate(lineForParsing)) {
                trueData.add(lineForParsing.trim().replaceAll(" +", " "));
            }
        }

        if (trueData.isEmpty()) {
            throw new ArrayCustomException("Invalid data received.");
        }

        resultArray = Arrays.stream(trueData.get(0).split(" ")).mapToInt(Integer::parseInt).toArray();
        logger.log(Level.DEBUG, "The first valid array: " + Arrays.toString(resultArray));
        return resultArray;
    }
}