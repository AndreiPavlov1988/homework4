public class Main {
    public static void main(String[] args) {
// task1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

//task2
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        boolean isLiteVersion = clientDeviceYear < 2015;
        boolean isIOS = clientOS == 0;
        boolean isAndroid = clientOS1== 1;
        if (isIOS && isLiteVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (isIOS && !isLiteVersion) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (isAndroid && isLiteVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (isAndroid && !isLiteVersion) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task3
        int year = 2021;
        if (year <= 1584) {
            System.out.println(year + " год не поддерживается для проверки (год должен быть больше 1584)");
        } else {
            boolean isLeapYear = false;
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        isLeapYear = true;
                    } else {
                        isLeapYear = false;
                    }
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
            if (isLeapYear) {
                System.out.println(year + " год является високосным");
            } else {
                System.out.println(year + " год не является високосным");
            }
//task4
            int deliveryDistance = 95;
            int deliveryDays = 0;
            if (deliveryDistance <= 20) {
                deliveryDays = 1;
            } else if (deliveryDistance <= 60) {
                deliveryDays = 2;
            } else if (deliveryDistance <= 100) {
                deliveryDays = 3;
            } else {
                System.out.println("Доставки нет");
            }
            System.out.println("Потребуется дней: " + deliveryDays);
//task5
            int monthNumber = 12;
            String season;

            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    season = "зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "осень";
                    break;
                default:
                    season = "неизвестный сезон";
                    break;
            }

            System.out.println("Месяц №" + monthNumber + " принадлежит к сезону: " + season);
        }
    }
}