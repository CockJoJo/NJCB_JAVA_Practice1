package Q10;

public class Q10 {
    public static void main(String[] args) {
        Thread thread1=new Thread("T1");
        Thread thread2=new Thread("T2");
        Thread thread3=new Thread("T3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
