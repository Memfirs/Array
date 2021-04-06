package test.ponomarenko.arrays.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArraySortServiceTest {

    public void bubbleSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void insertionSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void selectionSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void intStreamSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException;


    public void bubbleSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void insertionSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void selectionSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException;

    public void intStreamSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException;


    public void bubbleSortServiceTestException(DefaultArray array) throws ArrayCustomException;

    public void insertionSortServiceTestException(DefaultArray array) throws ArrayCustomException;

    public void selectionSortServiceTestException(DefaultArray array) throws ArrayCustomException;

    public void intStreamSortServiceTestException(DefaultArray array) throws ArrayCustomException;
}
