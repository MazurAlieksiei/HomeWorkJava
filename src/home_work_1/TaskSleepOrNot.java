package home_work_1;

import java.util.Scanner;

public class TaskSleepOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("You are on vacation?(Yes/No)");
        String vacationString = in.nextLine();
        System.out.println("Today is a weekday?(Yes/No)");
        String weekdayString = in.nextLine();

        boolean booleanVacation;
        boolean booleanWeekday;

        if (vacationString.equals("Yes")) {
            booleanVacation = true;
        } else {
            booleanVacation = false;
        }

        if (weekdayString.equals("Yes")) {
            booleanWeekday = true;
        } else {
            booleanWeekday = false;
        }

        if (sleepIn(booleanWeekday, booleanVacation)) {
            System.out.println("You can sleep =)");
        } else {
            System.out.println("Please, weak up!");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
}
