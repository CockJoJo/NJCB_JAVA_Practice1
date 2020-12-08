package Q12;

public class Q12 {
    int sNo;
    String sName;
    String sSex;
    int sAge;
    int sJava;
    public Q12(int n, int a, String Na, String s, int j){
        super();
        sNo = n;
        sName = Na;
        sSex = s;
        sAge = a;
        sJava = j;
    }
    public int getNo(){
        return sNo;
    }
    public String getName(){
        return sName;
    }
    public String getSex(){
        return sSex;
    }
    public int getAge(){
        return sAge;
    }
    public int getJava(){
        return sJava;
    }
    public static void main(String[] args){
        int min=100,max=0,sum=0;
        Q12[] sd = new Q12[5];
        sd[0] = new Q12(20114143,18,"王南","女",85);
        sd[1] = new Q12(20114144,19,"王北","男",86);
        sd[2] = new Q12(20114145,20,"王东","女",87);
        sd[3] = new Q12(20114146,21,"王西","男",88);
        sd[4] = new Q12(20114147,22,"王中","女",89);
        for(int i=0;i<sd.length;i++){
            System.out.println("学号："+sd[i].sNo+"年龄："+sd[i].sAge+sd[i].sName+sd[i].sSex+sd[i].sJava);
            if(sd[i].sJava<min){
                min = sd[i].sJava;
            }
            if(sd[i].sJava>max){
                max = sd[i].sJava;
            }
            sum = sum+sd[i].sJava;
        }
        System.out.println("最小值："+min+"最大值："+max+"平均值："+sum/sd.length);
    }
}
