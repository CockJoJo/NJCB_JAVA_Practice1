package Q5;

import java.util.Collection;
import java.util.LinkedList;

public class Test {

    public String checkPrice(Tourist t){
        int age = t.getAge();
        double price = Ticket.getPrice(age);
        String result = t.getName()+"'s price is $"+price;
        return result;
    }
    public static void main(String[] args) {

        Tourist jim = new Tourist("Jim",5);
        Tourist tom = new Tourist("Tom",15);
        Tourist fred = new Tourist("Fred", 25);
        Tourist jason = new Tourist("Jason",75);

        Collection<Tourist> tList = new LinkedList();
        Ticket.addPrice(new int[]{0, 10},0);
        Ticket.addPrice(new int[]{10,20},40);
        Ticket.addPrice(new int[]{20,60},80);

        tList.add(jason);
        tList.add(jim);
        tList.add(tom);
        tList.add(fred);

        for (Tourist o:tList){
            System.out.println(new Test().checkPrice(o));
        }


    }
}
