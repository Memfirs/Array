package by.ponomarenko.array.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.service.ArraySortService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySortServiceImpl implements ArraySortService {

    private static Logger logger = LogManager.getLogger();

    @Override
    public int[] bubbleSortService(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        boolean sorted = false;
        int tmpValue;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < tmpArray.length - 1; i++) {
                if (tmpArray[i] > tmpArray[i + 1]) {
                    tmpValue = tmpArray[i];
                    tmpArray[i] = tmpArray[i + 1];
                    tmpArray[i + 1] = tmpValue;
                    sorted = false;
                }
            }
        }
        logger.log(Level.DEBUG, "Array after bubble sort: " + Arrays.toString(tmpArray));
        return tmpArray;
    }

    @Override
    public int[] insertionSortService(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        for (int i = 1; i < tmpArray.length; i++) {
            int current = tmpArray[i];
            int j = i - 1;
            while (j >= 0 && current < tmpArray[j]) {
                tmpArray[j + 1] = tmpArray[j];
                j--;
            }
            tmpArray[j + 1] = current;
        }
        logger.log(Level.DEBUG, "Array after insertion sort: " + Arrays.toString(tmpArray));
        return tmpArray;
    }

    @Override
    public int[] selectionSortService(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        for (int i = 0; i < tmpArray.length; i++) {
            int min = tmpArray[i];
            int minId = i;
            for (int j = i + 1; j < tmpArray.length; j++) {
                if (tmpArray[j] < min) {
                    min = tmpArray[j];
                    minId = j;
                }
            }
            int tempValue = tmpArray[i];
            tmpArray[i] = min;
            tmpArray[minId] = tempValue;
        }
        logger.log(Level.DEBUG, "Array after selection sort: " + Arrays.toString(tmpArray));
        return tmpArray;
    }

    @Override
    public int[] intStreamSortService(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int[] sortArray = IntStream.of(tmpArray).sorted().toArray();
        logger.log(Level.DEBUG, "Array after IntStream sort: " + Arrays.toString(tmpArray));
        return sortArray;
    }
}
