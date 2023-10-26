package com.workintech.mobile;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Contact> contactList = new ArrayList<>();

        MobilePhone phone = new MobilePhone("122354653345", contactList);
        phone.addNewContact(new Contact("pinar" , "3165"));
        phone.addNewContact(new Contact("selcuk","653156"));
        phone.addNewContact(new Contact("alara","456443"));
        phone.addNewContact(new Contact("serhan","34533354"));
        phone.addNewContact(new Contact("fuat","5464535"));
        phone.printContact();

        System.out.println("Index name : " + phone.findContact("aslan"));
        System.out.println("Query contact : " + phone.queryContact("alara"));
        System.out.println("Search contacr : " + phone.search("fuat"));
    }
}
