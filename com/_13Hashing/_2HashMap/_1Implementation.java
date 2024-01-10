package com._13Hashing._2HashMap;
import java.util.*;
public class _1Implementation {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Tanvi",1852);
        map.put("Palak",983);
        map.put("Sehaj",1829);
        map.put("Bahl",1833);

        System.out.println(map.get("Palak"));
        System.out.println(map.getOrDefault("Tanvi",222)); //if doesn't exist then give default code
        System.out.println(map.containsKey("Palak"));
        System.out.println(map.containsValue(1983));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map); //same as above
    }
}
