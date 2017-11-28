package ru.geekbrains.java_core.lesson03;

import java.util.*;

public class lesson03 {

    public static void main(String[] args) {
        String [] arr = {"One", "Two","Three", "Two", "Another two", "Four", "Five", "Six",
                        "Seven", "Eight", "Nine", "Nine", "Ten", "Nine", "Odin",
                        "Dva", "One", "Tri", "Six", "Drugs", "Sex", "RocknRoll"};

        Set<String> set = new TreeSet<>(Arrays.asList(arr));
        Map<String, Integer> map = new HashMap<>();
        int counter;

        for (int i = 0; i < arr.length - 1; i++) {
            if (map.containsKey(arr[i])){
                counter = map.get(arr[i]);
                map.put(arr[i], ++counter);
            } else {
                map.put(arr[i], 1);
            }
        }

        System.out.println(set);
        System.out.println(map);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Prus", "123");
        phoneBook.add("Prus", "321");
        phoneBook.add("Prus", "456");
        phoneBook.add("Nick", "456");

        System.out.println(phoneBook.get("Prus"));
        System.out.println(phoneBook.get("Nick"));


    }
}
