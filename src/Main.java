public class Main {
    public static void main(String[] args) {
        //First Task
        printYearInfo(1234);
        //Second Task
        getActualVer(1245, 0);
        //Third Task
        short answer = getDeliveryTime(95);
        if (answer == -1) {
            System.out.println("==========ThirdTask==========\nВы вне нашей области работы. Извините, но мы не можем вам привезти карту.");
        } else {
            System.out.println("==========ThirdTask==========\nПериод доставки: " + answer + " дня.");
        }
    }
    public static void printYearInfo(int year) {

        //это условие можно упростить до одного if и else. Год високосный, когда он делится на 4 И не делится на 100 ИЛИ делится на 400
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
            System.out.println("==========FirstTask==========\n" + year + " год является високосным.");
        } else {
            System.out.println("==========FirstTask==========\n" + year + " год не является високосным.");
        }
    }
    public static short getDeliveryTime(int distanceToClient) {
        short deliveryTime = 2;
        if (distanceToClient <= 20) {
        } else if (distanceToClient <= 60) {
            deliveryTime++;
        } else if (distanceToClient <= 100) {
            deliveryTime += 2;
        } else if (distanceToClient > 100) {
            deliveryTime = -1;
        }
        return deliveryTime;
    }
    public static void getActualVer(int clientDeviceYear, int clientOS) {

        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("==========SecondTask==========\nУстановите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("==========SecondTask==========\nУстановите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("==========SecondTask==========\nУстановите облегченную версию приложения для Android по ссылке.");
        } else {
            System.out.println("==========SecondTask==========\nУстановите версию приложения для Android по ссылке.");
        }
    }
}



