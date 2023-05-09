import java.util.*;

public class BirthdayCalculator {
    public static int daysUntilBirthday(int currentDay, int currentMonth, int birthdayDay, int birthdayMonth) {
        int daysUntilBirthday = 0;


        if (birthdayMonth > currentMonth) {
            int daysInCurrentMonth = getDaysInMonth(currentMonth);
            daysUntilBirthday += daysInCurrentMonth - currentDay + birthdayDay;
            for (int i = currentMonth + 1 ; i < birthdayMonth; i++) {
                daysUntilBirthday += getDaysInMonth(i);
            }
        } else if (birthdayMonth < currentMonth || (birthdayMonth == currentMonth && currentDay > birthdayDay)) {
            int daysInCurrentMonth = getDaysInMonth(currentMonth);
            daysUntilBirthday += daysInCurrentMonth - currentDay + birthdayDay;
            for (int i = currentMonth + 1 ; i <= 12; i++) {
                daysUntilBirthday += getDaysInMonth(i) ;
            }
            for (int i = 1; i <= birthdayMonth - 1; i++)
            {
                daysUntilBirthday += getDaysInMonth(i) ;
            }
        }

        return daysUntilBirthday;
    }

    public static int getDaysInMonth(int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What month is it now? >>> ");
        int currentMonth = console.nextInt();
        console.nextLine();

        System.out.print("What day is it now? >>> ");
        int currentDay = console.nextInt();
        console.nextLine();

        System.out.print("What month is your birthday? >>> ");
        int birthdayMonth = console.nextInt();
        console.nextLine();

        System.out.print("What day is your birthday? >>> ");
        int birthdayDay = console.nextInt();
        console.nextLine();


        int daysUntilBirthday = daysUntilBirthday(currentDay, currentMonth, birthdayDay, birthdayMonth);

        System.out.println("Days until your birthday >>> " + daysUntilBirthday);
    }
}
