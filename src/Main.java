public class Main {
    public static void main(String[] args) {
        FirstTask task = new FirstTask();
        String answerHighYear = task.highYear(1242);
        System.out.println(answerHighYear);

        SecondTask task2 = new SecondTask();
        String solvation = task2.actualVer(1245, 1);
        System.out.println(solvation);

        ThirdTask task3 = new ThirdTask();
        String answer = task3.solveDistance(95);
        System.out.println(answer);
    }
}
class FirstTask {
    private int year;
    private String answerHighYear;
    public String highYear(int year) {
        this.year = year;
        //это условие можно упростить до одного if и else. Год високосный, когда он делится на 4 И не делится на 100 ИЛИ делится на 400
        if (year % 4 == 0 && !(year % 100 == 0) || year % 400 == 0) {
            answerHighYear = "==========FirstTask==========\n" + year + " год является високосным.";
        } else {
            answerHighYear = "==========FirstTask==========\n" + year + " год не является високосным.";
        }
        return answerHighYear;
    }
}
class SecondTask {
    private int clientDeviceYear;
    private int clientOS;
    private String solvation;
    public String actualVer(int clientDeviceYear, int clientOS) {
        this.clientDeviceYear = clientDeviceYear;
        this.clientOS = clientOS;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            solvation = "==========SecondTask==========\nУстановите облегченную версию приложения для iOS по ссылке.";
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            solvation = "==========SecondTask==========\nУстановите версию приложения для iOS по ссылке.";
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            solvation = "==========SecondTask==========\nУстановите облегченную версию приложения для Android по ссылке.";
        } else {
            solvation = "==========SecondTask==========\nУстановите версию приложения для Android по ссылке.";
        }
        return solvation;
    }
}
class ThirdTask {
    private int distanceToClient;
    private short deliveryTime = 2;
    private String answer;
    public String solveDistance(int distanceToClient) {
        this.distanceToClient = distanceToClient;
        if (distanceToClient <= 20) {
            answer = "==========ThirdTask==========\nПериод доставки: " + deliveryTime + " дня.";
        } else if (distanceToClient <= 60) {
            deliveryTime++;
            answer = "==========ThirdTask==========\nПериод доставки: " + deliveryTime + " дня.";
        } else if (distanceToClient <= 100) {
            deliveryTime += 2;
            answer = "==========ThirdTask==========\nПериод доставки: " + deliveryTime + " дня.";
        } else if (distanceToClient > 100) {
            answer = "==========ThirdTask==========\nИзвините, но мы не работаем в вашей области.";
        }
        return answer;
    }
}


