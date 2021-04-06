package by.ponomarenko.array.entity;

import java.util.Arrays;

public class DefaultArray {

    private int[] array;

    public DefaultArray() {
    }

    public DefaultArray(int... array) {
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (null == object) {
            return false;
        }
        if (getClass() != object.getClass()) {
            return false;
        }
        DefaultArray defaultArray = (DefaultArray) object;
        return Arrays.equals(array, defaultArray.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "Array values: " + Arrays.toString(array);
    }
}