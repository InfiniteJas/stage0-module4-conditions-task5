package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }
}
