package Q10;

public class Thread extends java.lang.Thread {
    public Thread(String str){
        super(str);
    }

    public void run(){
        for (int i =0;i<20;i++){
            System.out.print(" "+this.getName());
            try{
                sleep(300);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("    /end");
    }
}
