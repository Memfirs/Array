package test.ponomarenko.arrays.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.service.impl.ArraySearchValueServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.ponomarenko.arrays.service.ArraySearchValueServiceTest;

public class ArraySearchValueServiceImplTest implements ArraySearchValueServiceTest {

    ArraySearchValueServiceImpl arraySearchValueServiceImpl;

    @BeforeMethod
    public void setArray() {
        arraySearchValueServiceImpl = new ArraySearchValueServiceImpl();
    }

    @DataProvider(name = "exceptionTestData")
    public Object[][] exceptionTestData() {
        return new Object[][]{
                {new DefaultArray()}
        };
    }

    @DataProvider(name = "maxValueTestPositiveData")
    public Object[][] maxValueTestPositiveData() {
        return new Object[][]{
                {53, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {14, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {4, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(dataProvider = "maxValueTestPositiveData")
    public void maxValueTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.maxValue(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "maxValueTestPositiveData")
    public void maxValueIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.maxValue(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "maxValueTestNegativeData")
    public Object[][] maxValueTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {4, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {-4, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "maxValueTestNegativeData")
    public void maxValueTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.maxValue(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "maxValueTestNegativeData")
    public void maxValueIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.maxValueIntStream(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void maxValueTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.maxValue(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void maxValueIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.maxValueIntStream(array);
    }

    @DataProvider(name = "minValueTestPositiveData")
    public Object[][] minValueTestPositiveData() {
        return new Object[][]{
                {-12, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {-2, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {4, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Positive Test", dataProvider = "minValueTestPositiveData")
    public void minValueTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.minValue(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Positive Test", dataProvider = "minValueTestPositiveData")
    public void minValueIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.minValueIntStream(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "minValueTestNegativeData")
    public Object[][] minValueTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {14, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {0, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "minValueTestNegativeData")
    public void minValueTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.minValue(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "minValueTestNegativeData")
    public void minValueIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.minValueIntStream(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void minValueTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.minValue(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void minValueIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.minValueIntStream(array);
    }

    @DataProvider(name = "valueSumTestPositiveData")
    public Object[][] valueSumTestPositiveData() {
        return new Object[][]{
                {57, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {19, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {16, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Positive Test", dataProvider = "valueSumTestPositiveData")
    public void valueSumTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.sumValue(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Positive Test", dataProvider = "valueSumTestPositiveData")
    public void valueSumIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.sumValueIntStream(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "valueSumTestNegativeData")
    public Object[][] valueSumTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {14, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {0, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "valueSumTestNegativeData")
    public void valueSumTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.sumValue(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "valueSumTestNegativeData")
    public void valueSumIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.sumValueIntStream(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void sumValueTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.sumValue(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void sumValueIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.sumValueIntStream(array);
    }

    @DataProvider(name = "averageValueTestPositiveData")
    public Object[][] averageValueTestPositiveData() {
        return new Object[][]{
                {7.125, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {3.166, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {4, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Positive Test", dataProvider = "averageValueTestPositiveData")
    public void averageValueTestPositive(double expected, DefaultArray array) throws ArrayCustomException {
        double actual = arraySearchValueServiceImpl.averageValue(array);
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(description = "Positive Test", dataProvider = "averageValueTestPositiveData")
    public void averageValueIntStreamTestPositive(double expected, DefaultArray array) throws ArrayCustomException {
        double actual = arraySearchValueServiceImpl.averageValueIntStream(array);
        Assert.assertEquals(actual, expected, 0.1);
    }

    @DataProvider(name = "averageValueTestNegativeData")
    public Object[][] averageValueTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {14, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {0, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "averageValueTestNegativeData")
    public void averageValueTestNegative(double expected, DefaultArray array) throws ArrayCustomException {
        double actual = arraySearchValueServiceImpl.averageValue(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "averageValueTestNegativeData")
    public void averageValueIntStreamTestNegative(double expected, DefaultArray array) throws ArrayCustomException {
        double actual = arraySearchValueServiceImpl.averageValueIntStream(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void averageValueTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.averageValue(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void averageValueIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.averageValueIntStream(array);
    }

    @DataProvider(name = "positiveValueCountTestPositiveData")
    public Object[][] positiveValueCountTestPositiveData() {
        return new Object[][]{
                {4, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {3, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {4, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Positive Test", dataProvider = "positiveValueCountTestPositiveData")
    public void positiveValueCountTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.positiveValueCount(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Positive Test", dataProvider = "positiveValueCountTestPositiveData")
    public void positiveCountIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.positiveValueCountIntStream(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "positiveValueCountTestNegativeData")
    public Object[][] positiveValueCountTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {14, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {0, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "positiveValueCountTestNegativeData")
    public void positiveValueCountTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.positiveValueCount(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "positiveValueCountTestNegativeData")
    public void positiveCountIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.positiveValueCountIntStream(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void positiveValueCountTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.positiveValueCount(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void positiveCountIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.positiveValueCountIntStream(array);
    }

    @DataProvider(name = "negativeValueCountTestPositiveData")
    public Object[][] negativeValueCountTestPositiveData() {
        return new Object[][]{
                {1, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {2, new DefaultArray(14, -3, 2, 0, -9, 7)},
                {0, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Positive Test", dataProvider = "negativeValueCountTestPositiveData")
    public void negativeValueCountTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.negativeValueCount(array);
        Assert.assertEquals(actual, expected);
    }

    @Test(description = "Positive Test", dataProvider = "negativeValueCountTestPositiveData")
    public void negativeCountIntStreamTestPositive(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.negativeValueCountIntStream(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "negativeValueCountTestNegativeData")
    public Object[][] negativeValueCountTestNegativeData() {
        return new Object[][]{
                {-1, new DefaultArray(-1, 11, 5, 53, -5, 0, 6, -12)},
                {4, new DefaultArray(0, 4, -2, 6, 0, 11)},
                {8, new DefaultArray(4, 4, 4, 4)}
        };
    }

    @Test(description = "Negative Test", dataProvider = "negativeValueCountTestNegativeData")
    public void negativeValueCountTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.negativeValueCount(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(description = "Negative Test", dataProvider = "negativeValueCountTestNegativeData")
    public void negativeCountIntStreamTestNegative(int expected, DefaultArray array) throws ArrayCustomException {
        int actual = arraySearchValueServiceImpl.negativeValueCount(array);
        Assert.assertNotEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void negativeValueCountTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.negativeValueCount(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void negativeCountIntStreamTestException(DefaultArray array) throws ArrayCustomException {
        arraySearchValueServiceImpl.negativeValueCountIntStream(array);
    }
}