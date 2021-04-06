package by.ponomarenko.array.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArraySearchValueService {

    public int maxValue(DefaultArray array) throws ArrayCustomException;

    public int maxValueIntStream(DefaultArray array) throws ArrayCustomException;

    public int minValue(DefaultArray array) throws ArrayCustomException;

    public int minValueIntStream(DefaultArray array) throws ArrayCustomException;

    public int sumValue(DefaultArray array) throws ArrayCustomException;

    public int sumValueIntStream(DefaultArray array) throws ArrayCustomException;

    public double averageValue(DefaultArray array) throws ArrayCustomException;

    public double averageValueIntStream(DefaultArray array) throws ArrayCustomException;

    public int positiveValueCount(DefaultArray array) throws ArrayCustomException;

    public int positiveValueCountIntStream(DefaultArray array) throws ArrayCustomException;

    public int negativeValueCount(DefaultArray array) throws ArrayCustomException;

    public int negativeValueCountIntStream(DefaultArray array) throws ArrayCustomException;
}
