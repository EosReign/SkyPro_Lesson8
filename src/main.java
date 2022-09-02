import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        FirstTask task = new FirstTask(3234);
        SecondTask task2 = new SecondTask(2014, 1);
        ThirdTask task3 = new ThirdTask(124);
    }
}
class FirstTask {
    private int year;
    public FirstTask(int year) {
        this.year = year;
        System.out.println("==========FirstTask==========");
        if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    }
}
class SecondTask {
    private int clientDeviceYear;
    private int clientOS;
    public SecondTask(int clientDeviceYear, int clientOS) {
        this.clientDeviceYear = clientDeviceYear;
        this.clientOS = clientOS;
        System.out.println("==========SecondTask==========");
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
}
class ThirdTask {
    private int distanceToClient;
    public ThirdTask(int distanceToClient) {
        this.distanceToClient = distanceToClient;
        System.out.println("==========ThirdTask==========");
        short deliveryTime = 2;
        if (distanceToClient <= 20) {
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        } else if (distanceToClient <= 60) {
            deliveryTime++;
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        } else if (distanceToClient <= 100) {
            deliveryTime += 2;
            System.out.println("Период доставки: " + deliveryTime + " дня.");
        } else if (distanceToClient > 100) {
            System.out.println("Извините, но мы не работаем в вашей области.");
        }
    }
}



