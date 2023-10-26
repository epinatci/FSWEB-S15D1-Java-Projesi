package com.workintech.mobile;


import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber, List<Contact> contacts) {
        this.myNumber = myNumber;
        this.myContacts = contacts;
    }

    public boolean addNewContact(Contact contact) {
        if (!myContacts.contains(contact)){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact) && !oldContact.getPhoneNumber().equals(newContact.getPhoneNumber())){
            oldContact.setName(newContact.getName());
            oldContact.setPhoneNumber(newContact.getPhoneNumber());
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }

    public int findContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }
    public List<Contact> search(String contactName){
        List<Contact> searcedContacts = new ArrayList<>();
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                searcedContacts.add(contact);
            }
        }
        return searcedContacts;
    }

    public Contact queryContact(String contactName){
        for(Contact contact: myContacts){
            if(contact.getName().equals(contactName)){
                return contact;
            }
        }
        return null;
    }

    public void printContact(){
        for(int i = 0 ; i<myContacts.size(); i++){
            System.out.println((i+1) + "." + myContacts.get(i).getName() + "->" + myContacts.get(i).getPhoneNumber());
        }
    }

}
