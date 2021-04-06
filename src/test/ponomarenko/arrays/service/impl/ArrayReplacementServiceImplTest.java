package test.ponomarenko.arrays.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.service.impl.ArrayReplacementServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.ponomarenko.arrays.service.ArrayReplacementServiceTest;

public class ArrayReplacementServiceImplTest implements ArrayReplacementServiceTest {
    ArrayReplacementServiceImpl arrayReplacementServiceImpl;

    @BeforeMethod
    public void setArray() {
        arrayReplacementServiceImpl = new ArrayReplacementServiceImpl();
    }

    @DataProvider(name = "negativeToPositiveTestPositiveData")
    public Object[][] negativeToPositiveTestPositiveData() {
        return new Object[][]{
                {new int[]{1, 4, 3, 5, 8}, new DefaultArray(-1, 4, 3, -5, -8)},
                {new int[]{11, 0, 3, 5, 15}, new DefaultArray(-11, 0, 3, 5, 15)},
                {new int[]{1, 4, 3, 5, 8}, new DefaultArray(-1, 4, 3, -5, -8)}
        };
    }

    @Test(dataProvider = "negativeToPositiveTestPositiveData")
    public void negativeToPositiveTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arrayReplacementServiceImpl.negativeToPositiveReplacementService(array);
        Assert.assertEquals(actual, expected);
    }

    @DataProvider(name = "negativeToPositiveTestNegativeData")
    public Object[][] negativeToPositiveTestNegativeData() {
        return new Object[][]{
                {new int[]{-1, 4, 3, 5, 8}, new DefaultArray(-1, 4, 3, -5, -8)},
                {new int[]{-1, 4, 3, -5, -8}, new DefaultArray(-11, 0, 3, 5, 15)},
                {new int[]{-11, 0, 3, 5, 15}, new DefaultArray(-1, 4, 3, -5, -8)}
        };
    }

    @Test(dataProvider = "negativeToPositiveTestNegativeData")
    public void negativeToPositiveTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arrayReplacementServiceImpl.negativeToPositiveReplacementService(array);
        Assert.assertNotEquals(actual, expected);
    }

    @DataProvider(name = "exceptionTestData")
    public Object[][] exceptionTestData() {
        return new Object[][]{
                {new DefaultArray()}
        };
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void negativeToPositiveTestException(DefaultArray array) throws ArrayCustomException {
        arrayReplacementServiceImpl.negativeToPositiveReplacementService(array);
    }
}