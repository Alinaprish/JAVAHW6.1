package ru.netology.javahw6;

public class SQRService {

    public int NumberSQR(int x, int y, int j) {
        for (int i = 10; i < 100; i++) {
            if ((i * i >= x) & (i * i <= y)) {
                j++;
            }
        }
        return j;
    }
}

