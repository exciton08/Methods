import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printIsLeapYear(2022);
        recommendApplicationVersion(0, 2021);
        calculateDeliveryDays(101);
    }

    // Задание 1
    public static boolean isLeap(int year) {
        System.out.println("Задание 1");
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printIsLeapYear(int year) {
        boolean yearsIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearsIsLeap);
    }

    public static void printIsLeapYearResult(int year, boolean yearsIsLeap) {
        if (yearsIsLeap) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }


    //Задание 2
    public static boolean isDeviceOld(int deviceYear) {
        System.out.println();
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }
    public static void recommendApplicationVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviceOld(deviceYear);
        System.out.print("Установите");
        if (deviceIsOld) {
            System.out.print(" lite");
        }
        System.out.print(" версию для");
        if (clientOS == 0) {
            System.out.print(" iOs");
        } else {
            System.out.print(" Android");
        }
        System.out.println();
    }


    //задание 3
    public static void calculateDeliveryDays (int deliveryDistance) {
        System.out.println();
        System.out.println("Задание 3");
        int deliveryTime;
        if (deliveryDistance < 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance > 100) {
            System.out.println("Время доставки составляет от 3 дней и более");
        }
    }

}