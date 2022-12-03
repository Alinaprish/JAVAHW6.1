package ru.netology.javahw6;

public class SQRService {

    public int numberSQR(int firstBorder, int secondBorder) {
        int NumbSQR = 0;
        for (int i = 10; i < 100; i++) {
            if ((i * i >= firstBorder) & (i * i <= secondBorder)) {
                NumbSQR++;
            }
        }
        return NumbSQR;
    }
}

