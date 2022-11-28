package ru.netology.javaqa.javaqamvn.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javahw6.SQRService;

public class SQRServisTest {
    @Test
    public void testOne() {
        SQRService service = new SQRService();
        int expected = 16;
        int actual = service.NumberSQR(500, 1500, 0);
        // System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoError() {
        SQRService service = new SQRService();
        int expected = 15;
        int actual = service.NumberSQR(500, 1500, 0);
        // System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeZeroError() {
        SQRService service = new SQRService();
        int expected = 15;
        int actual = service.NumberSQR(0, 1500, 0);
        // System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeZero() {
        SQRService service = new SQRService();
        int expected = 29;
        int actual = service.NumberSQR(0, 1500, 0);
        // System.out.println(actual);

        Assertions.assertEquals(expected, actual);
    }


}
