public class Main {
    public static void main(String[] args) {

        task1();

    } // end of main

    public static void task1() {
        int currentYear = 2021;
        checkLeapYear(currentYear);
    } // end of task

    public static void checkLeapYear( int year ) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    } // end of checkLeapYear

} //end of Main