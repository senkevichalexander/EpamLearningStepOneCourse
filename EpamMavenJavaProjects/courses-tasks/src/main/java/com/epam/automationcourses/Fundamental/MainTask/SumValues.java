import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumValues {
    public void getSumAndMultiple(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые цисла: ");
        String value = scanner.nextLine();
        String[] integerStrings = value.split(" ");
        int[] integers = new int[integerStrings.length];
        for (int i = 0; i < integers.length; i++){
            integers[i] = Integer.parseInt(integerStrings[i]);}
        int sum = 0;
        for (int i = 0; i< integers.length; i++){
            sum +=integers[i];
        }
        int multiple = 1;
        for (int i = 0; i< integers.length; i++){
            multiple *=integers[i];
        }
        System.out.println("Sum =" +sum);
        System.out.println(("Miltiple = " + multiple));
    }
}
