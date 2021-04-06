package test.ponomarenko.arrays.service.impl;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.service.impl.ArraySortServiceImpl;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.ponomarenko.arrays.service.ArraySortServiceTest;

public class ArraySortServiceImplTest implements ArraySortServiceTest {

    ArraySortServiceImpl arraySortServiceImpl;

    @BeforeMethod
    public void setArray() {
        arraySortServiceImpl = new ArraySortServiceImpl();
    }

    @DataProvider(name = "sortServiceTestPositiveData")
    public Object[][] sortServiceTestPositiveData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new DefaultArray(5, 3, 4, 2, 1)},
                {new int[]{-2, 0, 2, 4, 6, 8}, new DefaultArray(0, 6, -2, 8, 2, 4)},
                {new int[]{0, 0, 0}, new DefaultArray(0, 0, 0)}
        };
    }

    @Test(description = "PositiveTest", dataProvider = "sortServiceTestPositiveData")
    public void bubbleSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.bubbleSortService(array);
        Assert.assertEquals(expected, actual);
    }

    @Test(description = "PositiveTest", dataProvider = "sortServiceTestPositiveData")
    public void insertionSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.insertionSortService(array);
        Assert.assertEquals(expected, actual);
    }

    @Test(description = "PositiveTest", dataProvider = "sortServiceTestPositiveData")
    public void selectionSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.selectionSortService(array);
        Assert.assertEquals(expected, actual);
    }

    @Test(description = "PositiveTest", dataProvider = "sortServiceTestPositiveData")
    public void intStreamSortServiceTestPositive(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.intStreamSortService(array);
        Assert.assertEquals(expected, actual);
    }

    @DataProvider(name = "sortServiceTestNegativeData")
    public Object[][] sortServiceTestNegativeData() {
        return new Object[][]{
                {new int[]{1, 2, 3, 4, 5}, new DefaultArray(5, 8, 4, 2, 1)},
                {new int[]{-2, 0, 2, 4, 6, 8}, new DefaultArray(0, 6, 2, 8, 2, 4)}
        };
    }

    @Test(description = "NegativeTest", dataProvider = "sortServiceTestNegativeData")
    public void bubbleSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.bubbleSortService(array);
        Assert.assertNotEquals(expected, actual);
    }

    @Test(description = "NegativeTest", dataProvider = "sortServiceTestNegativeData")
    public void insertionSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.insertionSortService(array);
        Assert.assertNotEquals(expected, actual);
    }

    @Test(description = "NegativeTest", dataProvider = "sortServiceTestNegativeData")
    public void selectionSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.selectionSortService(array);
        Assert.assertNotEquals(expected, actual);
    }

    @Test(description = "NegativeTest", dataProvider = "sortServiceTestNegativeData")
    public void intStreamSortServiceTestNegative(int[] expected, DefaultArray array) throws ArrayCustomException {
        int[] actual = arraySortServiceImpl.intStreamSortService(array);
        Assert.assertNotEquals(expected, actual);
    }

    @DataProvider(name = "exceptionTestData")
    public Object[][] exceptionTestData() {
        return new Object[][]{
                {new DefaultArray()}
        };
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void bubbleSortServiceTestException(DefaultArray array) throws ArrayCustomException {
        arraySortServiceImpl.bubbleSortService(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void insertionSortServiceTestException(DefaultArray array) throws ArrayCustomException {
        arraySortServiceImpl.insertionSortService(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void selectionSortServiceTestException(DefaultArray array) throws ArrayCustomException {
        arraySortServiceImpl.selectionSortService(array);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "exceptionTestData")
    public void intStreamSortServiceTestException(DefaultArray array) throws ArrayCustomException {
        arraySortServiceImpl.intStreamSortService(array);
    }
}
