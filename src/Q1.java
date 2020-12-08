import Q7.Input;

public class Q1 {
    public static boolean if_leap_year(int year){
        if (year/4!=0) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Input in = new Input();
        System.out.print("请输入年份：");
        int year = in.ScanInt();
        if (if_leap_year(year)){
            System.out.println("输入的年份"+year+"是闰年");
        }else{
            System.out.println("输入的年份"+year+"是平年");
        }
    }
}
