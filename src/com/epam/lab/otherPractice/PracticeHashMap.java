package com.epam.lab.otherPractice;

import java.util.*;

public class PracticeHashMap {
    public static void main(String[] arg){
        Map<String,String> hashmap1= new HashMap<>();
        hashmap1.put("Ukrain","Lviv");
        hashmap1.put("Ukrai","Odesa");
        hashmap1.put("Ukra","Kyiv");
        hashmap1.put("Ukraine","Harkiv");
        System.out.println(hashmap1.size());
        System.out.println(hashmap1.containsKey("Ukra"));
        System.out.println(hashmap1.containsValue("Lviv"));
        for (String key : hashmap1.keySet()) {
            System.out.println("Key: " + key);
        }
        for(String value: hashmap1.values()){
            System.out.println("Value:"+value);
        }
        for(Map.Entry entry: hashmap1.entrySet()){
            System.out.println("Key:"+entry.getKey()+" Values: "+entry.getValue());
        }
        System.out.println(hashmap1);

        Set<String> set = new TreeSet<>();
        set.add("sdfasdf");
        set.add("asdfasf");


        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(5);
//        Iterator<Integer> it = list.iterator();
//        if(it.hasNext()){
//            System.out.println(it.next());
//        }
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
