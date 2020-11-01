import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        try (Scanner scan = new Scanner(new File("input.txt"));
             FileWriter writer = new FileWriter(new File("output.txt"))) {

            while (scan.hasNextLine()) {
                stack.push(scan.nextLine());
            }

            int sizeStack = stack.size();
            for (int i = 0; i < sizeStack; i++) {
                writer.write(stack.pop() + "\n");
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}

