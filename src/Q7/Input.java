package Q7;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);

    public int ScanInt(){
        int i = scanner.nextInt();
        return i;
    };

    public Double ScanDouble(){
        Double d = scanner.nextDouble();
        return d;
    };

    public String ScanString(){
        String s = scanner.nextLine();
        return s;
    };

}
