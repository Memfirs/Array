package by.ponomarenko.array.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArrayReplacementService {

    public int[] negativeToPositiveReplacementService(DefaultArray array) throws ArrayCustomException;
}
