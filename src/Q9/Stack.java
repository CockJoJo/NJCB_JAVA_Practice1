package Q9;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> arrayList;

    /**
     * 入栈
     */
    public void push(T t) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(t);
    }

    /**
     * 出栈
     */
    public T pop() {
        if (arrayList != null && arrayList.size() > 0) {
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    /**
     * 查看栈顶元素
     */
    public T peek() {
        if (arrayList != null && arrayList.size() > 0) {
            return arrayList.get(arrayList.size() - 1);
        }
        return null;
    }

    public int size() {
        return arrayList == null ? 0 : arrayList.size();
    }
}