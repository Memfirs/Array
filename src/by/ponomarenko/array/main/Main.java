package by.ponomarenko.array.main;

import by.ponomarenko.array.entity.DefaultArray;
import by.ponomarenko.array.exception.ArrayCustomException;
import by.ponomarenko.array.parser.DataParser;
import by.ponomarenko.array.reader.TxtFileReader;
import by.ponomarenko.array.service.impl.ArraySortServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws ArrayCustomException {
        TxtFileReader txtFileReader = new TxtFileReader();
        DataParser dataParser = new DataParser();
        ArraySortServiceImpl arraySortService = new ArraySortServiceImpl();

        List<String> list = txtFileReader.readFromTxt();

        int[] array = dataParser.toIntArrayParser(list);

        DefaultArray defaultArray = new DefaultArray(array);
        arraySortService.selectionSortService(defaultArray);
    }
}
