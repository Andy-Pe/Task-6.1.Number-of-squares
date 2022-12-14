package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/numbersRange.csv")
    public void numberOfSquares(int expected, int start, int finish) {

        SqrService service = new SqrService();
        int actual = service.calcSqr(start, finish);

        Assertions.assertEquals(expected, actual);
    }
}
