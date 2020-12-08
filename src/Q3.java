import java.util.Arrays;

public class Q3 {
    public static Integer[] buddleSort(Integer[] unsort){
        int tmp =0;
        for (int i =0; i<unsort.length-1;i++){
            for (int j=0;j<unsort.length-1-i;j++){
                if(unsort[j]>unsort[j+1]) {
                    tmp = unsort[j];
                    unsort[j] = unsort[j + 1];
                    unsort[j + 1] = tmp;
                }
            }
        }
        return unsort;
    }

    public static void main(String[] args) {
        Integer[] unsort = {4,3,2,6,1};
        Integer[] sorted = buddleSort(unsort);
        System.out.println(Arrays.toString(sorted));
    }
}