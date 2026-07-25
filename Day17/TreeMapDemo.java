package Day17;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(103,"John");
        map.put(101,"David");
        map.put(102,"Alex");

        System.out.println(map);

        System.out.println(map.firstKey());

        System.out.println(map.lastKey());

        System.out.println(map.higherKey(101));
    }
}