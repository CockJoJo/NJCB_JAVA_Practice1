package Q9;

public class Q9 {
    public static void main(String[] args) {
        System.out.println("栈堆的实现：");
        Stack stack = new Stack();
        int[] sample = new int[]{100,101,102,103,104,105};

        for (int i = 0; i<6; i++){
            stack.push(sample[i]);
        }
        System.out.println("get the top element in the stake, the element is : " + stack.pop());
        System.out.println("get the top element in the stake, the element is : " + stack.pop());
        System.out.println("get the top element in the stake, the element is : " + stack.pop());
        System.out.println("get the top element in the stake, the element is : " + stack.pop());
        System.out.println("get the top element in the stake, the element is : " + stack.pop());
        System.out.println("get the top element in the stake, the element is : " + stack.pop());

    }
}
