package Q7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args) {

        while (true){
        String s1 = null, s2 = null, ss, si, sf;
        int i1, i2;
        float f1, f2;
        BufferedReader strin = new BufferedReader(new InputStreamReader(
                System.in));
        try {
            System.out.print("请输入第一个字符串：");
            s1 = strin.readLine();// 按行读取，当读到流的末尾时返回null
            System.out.print("请输入第二个字符串：");
            s2 = strin.readLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            i1 = Integer.parseInt(s1);
            i2 = Integer.parseInt(s2);
            f1 = Float.parseFloat(s1);
            f2 = Float.parseFloat(s2);
            ss = ReadString.concatString(s1, s2);
            si = ReadString.plusInt(i1, i2);
            sf = ReadString.plusFloat(f1, f2);
            System.out.println("输入的两个字符串相加结果为：" + ss);
            System.out.println("输入的两个字符串转换成整数相加结果为：" + si);
            System.out.println("输入的两个字符串转换成浮点数相加结果为：" + sf);
        } catch (Exception e) {
            System.out.println("输入的不合法，请重新输入！");
        }


        }
    }
}
