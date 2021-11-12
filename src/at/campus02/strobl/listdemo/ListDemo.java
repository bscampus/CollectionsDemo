package at.campus02.strobl.listdemo;

import java.util.ArrayList;
import java.util.Enumeration;

public class ListDemo {

    public static void main(String[] args) {

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(7);
        intList.add(9);
        intList.add(435);
        intList.add(2);

        int first = intList.get(0);

        for (int i = 0; i < intList.size(); i++) {
            int n = intList.get(i);
            System.out.println("n = " + n);
        }
        
        for (int number : intList) {
            System.out.println("number = " + number);
        }
    }
}
