public class Q2 {
    public static int facticalSum(int num){

        if(num<0){
            throw new IllegalArgumentException("必须是正整数");
        }

        int sum=0;

        for (int i =1; i<=num; i++){
            int recursion = recursion(i);
            sum += recursion;
        }
        return sum;
    }

    public static int recursion(int num){
        int sum=1;
        if (num==1){
            return 1;
        }else {
            sum=num*recursion(num-1);
            return sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(facticalSum(10));
    }
}
