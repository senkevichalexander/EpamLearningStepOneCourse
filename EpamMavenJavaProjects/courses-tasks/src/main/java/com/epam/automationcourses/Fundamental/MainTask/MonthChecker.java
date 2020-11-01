import java.util.Scanner;

public class MonthChecker {
    public void setMonth() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер месяца: ");
        int n = sc.nextInt();
        String[] months = {"январь", "феваль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
        String s;
        try {
            s = months[n - 1];
            System.out.println("Это месяц - " + s + ".");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого месяца не существует");
        }

    }
}
