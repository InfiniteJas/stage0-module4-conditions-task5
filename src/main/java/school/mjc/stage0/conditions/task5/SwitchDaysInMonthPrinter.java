package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days;
        switch (month) {
            case 1: // Январь
            case 3: // Март
            case 5: // Май
            case 7: // Июль
            case 8: // Август
            case 10: // Октябрь
            case 12: // Декабрь
                days = 31;
                break;
            case 4: // Апрель
            case 6: // Июнь
            case 9: // Сентябрь
            case 11: // Ноябрь
                days = 30;
                break;
            case 2: // Февраль
                days = 28;
                break;
            default:
                days = -1; // Некорректный месяц
                break;
        }
        if (days != -1) {
            System.out.println(days);
        } else {
            System.out.println("wrong number!");
        }
    }
}
