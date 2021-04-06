package test.ponomarenko.arrays.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArrayReplacementServiceTest {

    public void negativeToPositiveTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void negativeToPositiveTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void negativeToPositiveTestException(DefaultArray array) throws ArrayCustomException;
}
