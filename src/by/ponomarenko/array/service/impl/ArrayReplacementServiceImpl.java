package by.ponomarenko.array.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayReplacementServiceImpl implements by.ponomarenko.array.service.ArrayReplacementService {

    private static Logger logger = LogManager.getLogger();

    @Override
    public int[] negativeToPositiveReplacementService(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        for (int i = 0; i < tmpArray.length; i++) {
            if (tmpArray[i] < 0) {
                tmpArray[i] = Math.abs(tmpArray[i]);
            }
        }
        logger.log(Level.DEBUG, "Array after replacement: " + Arrays.toString(tmpArray));
        return tmpArray;
    }
}