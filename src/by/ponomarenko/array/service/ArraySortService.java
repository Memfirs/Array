package by.ponomarenko.array.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArraySortService {

    public int[] bubbleSortService(DefaultArray array) throws ArrayCustomException;

    public int[] insertionSortService(DefaultArray array) throws ArrayCustomException;

    public int[] selectionSortService(DefaultArray array) throws ArrayCustomException;

    public int[] intStreamSortService(DefaultArray array) throws ArrayCustomException;
}
