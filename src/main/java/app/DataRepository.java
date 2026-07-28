package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {

    public List<String> getData() {

        List<String> list1 = new ArrayList<>();
        list1.add("Alice");
        list1.add("Bob");
        list1.add("Lucy");
        list1.add("Denis");
        list1.add("Tom");

        System.out.println("1) Data: " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Bob");
        list2.add("Denis");

        System.out.println("2) Data: " + list2);

        list1.retainAll(list2);

        System.out.println("3) Data: " + list1);

        return list1;
    }
}