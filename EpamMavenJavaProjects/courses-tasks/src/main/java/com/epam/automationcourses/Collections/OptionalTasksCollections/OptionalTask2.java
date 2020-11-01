import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OptionalTask2 {
    public static void main(String[] args) throws FileNotFoundException {
                Scanner scan = new Scanner(new File("D:/test.txt"));
                ArrayList<String> arrayString = new ArrayList<>();

                while (scan.hasNext()) {
                    arrayString.add(scan.nextLine());
                }
                scan.close();
                Collections.sort(arrayString);

                for (String anArrayString : arrayString) {
                    System.out.println(anArrayString);
                }
            }
        }
