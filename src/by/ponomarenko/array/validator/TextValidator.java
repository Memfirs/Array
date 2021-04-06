package by.ponomarenko.array.validator;

public class TextValidator {

    private static final String ONLY_INTEGER = "(-?\\d *)+";

    public boolean intValidate(String line) {
        return line.matches(ONLY_INTEGER);
    }
}