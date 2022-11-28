package ru.netology.javahw6;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int x = 500;
        int y = 1500;
        int j = 0;
        int actual = service.NumberSQR(500, 1500, 0);
        System.out.println(actual);
    }
}






