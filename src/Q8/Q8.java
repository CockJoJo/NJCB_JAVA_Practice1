package Q8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q8 {
    public static void main(String[] args) {
        byte[] bytes = new byte[2056];

        try {
            FileInputStream fil = new FileInputStream("src/Q8/Q8.java");
            try {
                int data = fil.read(bytes, 0, 2056);
                String str = new String(bytes, 0, data);
                System.out.println(str);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
