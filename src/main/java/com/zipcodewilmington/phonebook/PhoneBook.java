package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
    public class PhoneBook {

        private final Map<String, List<String>> phonebook;

        public PhoneBook(Map<String, List<String>> map) {
            this.phonebook = new HashMap<>();
        }

        public PhoneBook() {
            this.phonebook = new HashMap<>();
        }

        public void add(String name, String phoneNumber) {
                ArrayList<String> phoneNum = new ArrayList<>();
                phoneNum.add(phoneNumber);
                this.phonebook.put(name, phoneNum);
        }

        public void addAll(String name, String... phoneNumbers) {
            List myPhone = Arrays.asList(phoneNumbers);
            this.phonebook.put(name, myPhone);
        }



    public void remove(String name) {
            this.phonebook.remove(name);

    }

    public Boolean hasEntry(String name, String phoneNumber) {
            boolean result = false;
            if(this.phonebook.get(name) != null && this.phonebook.get(name).contains(phoneNumber)) {
                result = true;
            }

        return result;
    }

    public List<String> lookup(String name) {

        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String name = "";
        for (Map.Entry<String,List<String>> i : phonebook.entrySet()) {
            if (i.getValue().contains(phoneNumber)){
                name = i.getKey();
            }
        }
        return name;
    }

    public List<String> getAllContactNames() {
            ArrayList<String> names = new ArrayList<>();
            names.add(String.valueOf(this.phonebook.keySet()));
            this.phonebook.entrySet();
        return names;
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}

