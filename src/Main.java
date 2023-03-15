import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();

    } // end of main

    public static void task1() {
        int currentYear = 2021;
        System.out.println("Задача 1");
        checkLeapYear(currentYear);
        System.out.println();
    } // end of task

    public static void checkLeapYear( int year ) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    } // end of checkLeapYear

    public static void task2() {
        int osType = 1;
        int clientDeviceYear = 2023;
        System.out.println("Задача 2");
        chooseOS(osType,clientDeviceYear);
        System.out.println();
    } // end of task

    public static void chooseOS( int os, int deviceYear ) {
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            if (os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (os == 0) {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    } // end of checkLeapYear

} //end of Main