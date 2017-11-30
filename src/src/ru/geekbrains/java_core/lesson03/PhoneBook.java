package ru.geekbrains.java_core.lesson03;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class PhoneBook {
        private Map<String, LinkedList<String>> map;

        public PhoneBook(){
            map = new HashMap<>();
        }

        public void add(String lastName, String phone){
            LinkedList<String> linkedList = new LinkedList<>();
//            if (map.containsKey(lastName)){
//                linkedList = map.get(lastName);
//                linkedList.add(phone);
//                map.put(lastName, linkedList);
//            } else {
////                linkedList.add(phone);
////                map.put(lastName, linkedList);
//                map.get(lastName).add(phone);
//            }


            if (!map.containsKey(lastName)){
                map.put(lastName, new LinkedList<>());
            }
            map.get(lastName).add(phone);

        }

        public LinkedList<String> get(String lastName){
            return map.get(lastName);

        }

}
