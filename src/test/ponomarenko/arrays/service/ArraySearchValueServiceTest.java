package test.ponomarenko.arrays.service;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;

public interface ArraySearchValueServiceTest {

    public void maxValueTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void maxValueIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void maxValueTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void maxValueIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void maxValueTestException(DefaultArray array) throws ArrayCustomException;

    public void maxValueIntStreamTestException(DefaultArray array) throws ArrayCustomException;


    public void minValueTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void minValueIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void minValueTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void minValueIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void minValueTestException(DefaultArray array) throws ArrayCustomException;

    public void minValueIntStreamTestException(DefaultArray array) throws ArrayCustomException;


    public void valueSumTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void valueSumIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void valueSumTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void valueSumIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void sumValueTestException(DefaultArray array) throws ArrayCustomException;

    public void sumValueIntStreamTestException(DefaultArray array) throws ArrayCustomException;


    public void averageValueTestPositive(double expected, DefaultArray array) throws ArrayCustomException;

    public void averageValueIntStreamTestPositive(double expected, DefaultArray array) throws ArrayCustomException;

    public void averageValueTestNegative(double expected, DefaultArray array) throws ArrayCustomException;

    public void averageValueIntStreamTestNegative(double expected, DefaultArray array) throws ArrayCustomException;

    public void averageValueTestException(DefaultArray array) throws ArrayCustomException;

    public void averageValueIntStreamTestException(DefaultArray array) throws ArrayCustomException;


    public void positiveValueCountTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void positiveCountIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void positiveValueCountTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void positiveCountIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void positiveValueCountTestException(DefaultArray array) throws ArrayCustomException;

    public void positiveCountIntStreamTestException(DefaultArray array) throws ArrayCustomException;


    public void negativeValueCountTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void negativeCountIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException;

    public void negativeValueCountTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void negativeCountIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException;

    public void negativeValueCountTestException(DefaultArray array) throws ArrayCustomException;

    public void negativeCountIntStreamTestException(DefaultArray array) throws ArrayCustomException;
}
