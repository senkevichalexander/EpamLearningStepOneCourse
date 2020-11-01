import java.util.Scanner;

public class ReverseSequence {
    public void makeReverse() {
        Scanner enter = new Scanner(System.in);
        StringBuilder values = new StringBuilder(enter.nextLine());
        values.reverse();
        values.toString();
        System.out.println("Hello " + values.toString());}

}
