import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HelloApp.helloPrint();//task1

        ReverseSequence reverseValues = new ReverseSequence();
        reverseValues.makeReverse();//task2

        int[] array = {1, 3, 9, 15, 2};
        RandomWithRowsOrNot randomValues = new RandomWithRowsOrNot();
        randomValues.randomPrintInt(array);//task3

        SumValues sumValues = new SumValues();
        sumValues.getSumAndMultiple();//task4


        MonthChecker monthChecker = new MonthChecker();
        monthChecker.setMonth();//task5









    }
}
