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
            this.phonebook =map;
        }

        public PhoneBook() {
            phonebook = new LinkedHashMap<>();
        }

        public void add(String name, String phoneNumber) {
                ArrayList<String> phoneNum = new ArrayList<>();
                phoneNum.add(phoneNumber);
                phonebook.put(name, phoneNum);
        }

        public void addAll(String name, String... phoneNumbers) {
            List myPhone = Arrays.asList(phoneNumbers);
            phonebook.put(name, myPhone);
        }



    public void remove(String name) {
            phonebook.remove(name);

    }

    public Boolean hasEntry(String name, String phoneNumber) {
            boolean result = false;
            if(phonebook.get(name) != null && phonebook.get(name).contains(phoneNumber)) {
                result = true;
            }

        return result;
    }

    public List<String> lookup(String name) {

        return this.phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {
        String name = "";
        for (Map.Entry<String,List<String>> num : phonebook.entrySet()) {
            if (num.getValue().contains(phoneNumber)){
                name = num.getKey();
            }
        }
        return name;
    }

    public List<String> getAllContactNames() {

        return new ArrayList<>(phonebook.keySet());
    }

    public Map<String, List<String>> getMap() {
        return this.phonebook;
    }
}

