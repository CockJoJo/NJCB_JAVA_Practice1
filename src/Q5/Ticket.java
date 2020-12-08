package Q5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ticket {
    private static Map priceMap = new HashMap();

    public static void addPrice(int[] age,double price){
        priceMap.put(age,price);
    }

    public static void removePrice(int[] age){
        priceMap.remove(age);
    }

    public static void alterPrice(int[] age,double price){
        priceMap.put(age,price);
    }

    public static Set getPriceMapKey() {
        return priceMap.keySet();
    }

    public static double getPrice(int age){
        Set key = priceMap.keySet();
        for (Object o:key){
            int[] a = (int[])o;
            if (a[0] < age&&a[1]>=age){
                double price = (double) priceMap.get(o);
                return price;
            }
        }
        return 0;
    }

    public static Collection getPriceMapValue() {
        return priceMap.values();
    }

    @Override
    public String toString() {
        String fin = "";
        Set key = priceMap.keySet();
        for (Object o:key){
            fin = fin +"/"+(String)o+ ":" + priceMap.get(key);
        }
        return fin;
    }
}
