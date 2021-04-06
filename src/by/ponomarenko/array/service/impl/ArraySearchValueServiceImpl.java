package by.ponomarenko.array.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.IntStream;

public class ArraySearchValueServiceImpl implements by.ponomarenko.array.service.ArraySearchValueService {

    private static Logger logger = LogManager.getLogger();

    @Override
    public int maxValue(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int maxValue = tmpArray[0];
        for (int value : tmpArray) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        logger.log(Level.DEBUG, "Array maximum value = " + maxValue);
        return maxValue;
    }

    @Override
    public int maxValueIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int maxValue = IntStream.of(tmpArray).max().orElseThrow();
        logger.log(Level.DEBUG, "Array maximum value = " + maxValue);
        return maxValue;
    }

    @Override
    public int minValue(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int minValue = tmpArray[0];
        for (int value : tmpArray) {
            if (minValue > value) {
                minValue = value;
            }
        }
        logger.log(Level.DEBUG, "Array minimum value = " + minValue);
        return minValue;
    }

    @Override
    public int minValueIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int minValue = IntStream.of(tmpArray).min().orElseThrow();
        logger.log(Level.DEBUG, "Array minimum value = " + minValue);
        return minValue;
    }

    @Override
    public int sumValue(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int sumValue = 0;
        for (int value : tmpArray) {
            sumValue = sumValue + value;
        }
        logger.log(Level.DEBUG, "Sum of elements = " + sumValue);
        return sumValue;
    }

    @Override
    public int sumValueIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int sumValue = IntStream.of(tmpArray).sum();
        logger.log(Level.DEBUG, "Sum of elements = " + sumValue);
        return sumValue;
    }

    @Override
    public double averageValue(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        double sumValue = 0;
        for (int value : tmpArray) {
            sumValue = sumValue + value;
        }
        double averageValue = sumValue / tmpArray.length;
        logger.log(Level.DEBUG, "Average value of elements = " + averageValue);
        return averageValue;
    }

    @Override
    public double averageValueIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        double averageValue = IntStream.of(tmpArray).average().orElseThrow();
        logger.log(Level.DEBUG, "Average value of elements = " + averageValue);
        return averageValue;
    }

    @Override
    public int positiveValueCount(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int positiveCount = 0;
        for (int value : tmpArray) {
            if (value > 0) {
                positiveCount++;
            }
        }
        logger.log(Level.DEBUG, "Positive elements count = " + positiveCount);
        return positiveCount;
    }

    @Override
    public int positiveValueCountIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int positiveCount = (int) IntStream.of(tmpArray).filter(value -> value > 0).count();
        logger.log(Level.DEBUG, "Positive elements count = " + positiveCount);
        return positiveCount;
    }

    @Override
    public int negativeValueCount(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int negativeCount = 0;
        for (int value : tmpArray) {
            if (value < 0) {
                negativeCount++;
            }
        }
        logger.log(Level.DEBUG, "Negative elements count = " + negativeCount);
        return negativeCount;
    }

    @Override
    public int negativeValueCountIntStream(DefaultArray array) throws ArrayCustomException {
        if (array.getArray() == null || array.getArray().length == 0) {
            throw new ArrayCustomException("Invalid array data");
        }
        int[] tmpArray = array.getArray();
        int negativeCount = (int) IntStream.of(tmpArray).filter(value -> value < 0).count();
        logger.log(Level.DEBUG, "Negative elements count = " + negativeCount);
        return negativeCount;
    }
}