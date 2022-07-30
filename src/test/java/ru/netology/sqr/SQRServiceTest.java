package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void sqrNumbersFromMinToMaxRange() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.sqrNumbersFromExactRange(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrNumbersFromMinToMinRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrNumbersFromExactRange(200, 200);

        assertEquals(expected, actual);
    }

    @Test
    public void sqrNumbersFromZeroToZeroRange() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.sqrNumbersFromExactRange(0, 0);

        assertEquals(expected, actual);
    }
}

