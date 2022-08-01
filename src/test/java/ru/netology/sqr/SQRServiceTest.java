package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @Test
    public void t1() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;
        assertEquals(expected, actual);

    }


    @Test
    public void t2() {
        SQRService service = new SQRService();

        int actual = service.calculate(300, 400);
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    public void t3() {
        SQRService service = new SQRService();

        int actual = service.calculate(1000, 1200);
        int expected = 3;
        assertEquals(expected, actual);

    }
}


