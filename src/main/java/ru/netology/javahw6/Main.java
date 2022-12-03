package ru.netology.javahw6;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int firstBorder = 500;
        int secondBorder = 1500;
        int NumbSQR = 0;
        int actual = service.numberSQR(500, 1500);
        System.out.println(actual);
    }
}






