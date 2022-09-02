import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        new HandlerRequest();
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
class HandlerRequest {
    public HandlerRequest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите задание домашней работы (Выход: -1)(Варианты ответа: 1, 2, 3): ");
        int number = sc.nextInt();
        if (number > 3) {
            System.out.println("Вы ввели несуществующее задание.");
            new HandlerRequest();
        } else if (number == 1) {
            System.out.println("Вы выбрали первое задание.\nВведите необходимый вам год для обработки на високосность: ");
            int year = sc.nextInt();
            new FirstTask(year);
            new HandlerRequest();
        } else if (number == 2) {
            System.out.println("Вы выбрали второе задание.\nВведите год производства вашего смартфона: ");
            int clientDeviceYear = sc.nextInt();
            System.out.println("Введите OC вашего смартфона(Android:1 or iOC:0): ");
            int clientOS = sc.nextInt();
            new SecondTask(clientDeviceYear, clientOS);
            new HandlerRequest();
        } else if (number == 3) {
            System.out.println("Вы выбрали третье задание.\nВведите дистанцию от ближайшего банка до вашего места доставки в км: ");
            int distanceToClient = sc.nextInt();
            new ThirdTask(distanceToClient);
            new HandlerRequest();
        } else if (number == -1) {
            System.out.println("Bye, Bye!");
            System.out.println("⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⣀⣀⣠⣤⣤⣄⣀⣀⣀⡀\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⣀⠤⠖⠊⠉⠁⠄⠄⠄⠄⠄⠄⠄⠄⠈⠉⠙⠲⢤⡀\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⡤⠊⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢦⡀\n" +
                    "⠄⠄⠄⠄⠄⠄⡜⠄⠄⠄⠄⠄⠄⢀⡀⠄⠄⠄⠄⠄⠄⠄⠄⠄⢢⠄⠄⠄⠄⠄⢳\n" +
                    "⠄⠄⠄⠄⠄⣸⠁⠄⠄⠄⠄⠄⠄⠄⠱⡀⠄⠄⠄⠄⠄⠄⠄⡀⠈⠄⡀⠄⠄⠄⠈⡇\n" +
                    "⠄⠄⠄⠄⠄⡏⠄⠄⠄⠄⠄⠄⠄⠄⡰⠁⠄⠄⠄⠄⠄⠄⠄⠘⡆⡜⠁⠄⠄⠄⠄⢧⡀\n" +
                    "⠄⠄⠄⠄⠄⡇⠄⠄⠄⠄⠄⠄⠄⠸⡀⠄⠄⠄⠄⠄⣀⣤⡂⠄⠇⠱⠄⡀⠄⠄⠄⠄⡇\n" +
                    "⠄⠄⠄⠄⠄⢇⠄⠄⠄⠄⠄⠄⠄⠄⠈⢄⡀⢠⣟⢭⣥⣤⠽⡆⠄⡶⣊⣉⣲⣤⢀⡞\n" +
                    "⠄⠄⠄⠄⠄⠘⣆⠄⠄⠄⠄⠄⠄⡀⠄⠐⠂⠘⠄⣈⣙⡡⡴⠄⠄⠙⣄⠙⣛⠜⠘⣆\n" +
                    "⠄⠄⠄⠄⠄⠄⠈⢦⡀⠄⠄⠄⢸⠁⠄⠄⠄⠄⠄⠄⠄⠊⠄⠄⠄⠄⡸⠛⠄⠄⠄⢸\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠈⠓⠦⢄⣘⣄⠄⠄⠄⠄⠄⠄⠄⡠⠄⠄⠄⠄⣇⡀⠄⠄⣠⠎\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣸⠁⠈⡟⠒⠲⣄⠄⠄⡰⠇⠖⢄⠄⠄⡹⡇⢀⠎\n" +
                    "⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡇⠄⠄⡇⠄⠄⠹⠄⡞⠄⠄⢀⠤⣍⠭⡀⢱⢸\n" +
                    "⠄⠄⠄⠄⠄⠄⢀⣀⣀⣠⠞⠄⠄⢠⡇⠄⠄⠄⠄⠁⠄⢴⠥⠤⠦⠦⡼⠄⢸\n" +
                    "⣀⣤⣴⣶⣿⣿⡟⠁⠄⠋⠄⠄⠄⢸⠁⠄⠄⠄⠄⠄⠄⠄⠑⣠⢤⠐⠁⠄⢸\n" +
                    "⣿⣿⣿⣿⣿⡟⠄⠄⠄⠄⠄⠄⠄⢸⡀⠄⠄⠄⠄⠄⠄⠄⠄⠬⠥⣄⠄⠄⠈⠲⡄\n" +
                    "⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠙⠦⣄⠄⠄⠄⠄⠄⠄⠄⠄⠈⢳⠄⠄⢀⣿⡀\n" +
                    "⣿⣿⣿⣿⣿⣧⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠙⠒⠦⠤⢤⣄⣀⣠⠤⢿⣶⣶⣿⣿⣿⣶⣤⡀\n" +
                    "⣿⣿⣿⣿⣿⣿⣷⣄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢀⡼⠁⠄⠄⣠⣾⣿⣿⣿⣿⣿⣿⣿⣿⣄\n" +
                    "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣦⣤⣤⣀⣀⣀⣀⣀⣀⣀⣤⣤⣤⣶⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
        }
    }
}


