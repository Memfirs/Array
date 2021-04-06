package by.ponomarenko.array.exception;

public class ArrayCustomException extends Exception {

    public ArrayCustomException() {
    }

    public ArrayCustomException(String message) {
        super(message);
    }

    public ArrayCustomException(Throwable cause) {
        super(cause);
    }

    public ArrayCustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
