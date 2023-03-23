package main.java.com.hillel.zakushniak.lessons.lesson6.homework5.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Note> myContacts;

    public Phonebook() {
        myContacts = new ArrayList<>() {
        };
    }

    private void addNote(String name, int phoneNumber) {
        myContacts.add(new Note(name, phoneNumber));
    }

    private Note find(String name) {

        for (Note myContact : myContacts) {

            if (myContact.getName().equals(name)) {
                return myContact;
            }

        }
        return null;
    }

    private List findAll(String name) {
        List allFinded = new ArrayList<>();

        for (Note myContact : myContacts) {

            if (myContact.getName().equals(name)) {
                allFinded.add(myContact);
            }

        }
        return allFinded;

    }

    public static void main(String[] args) {

        Phonebook myContacts = new Phonebook();

        myContacts.addNote("Bill", 64458463);
        myContacts.addNote("Bruce", 2135468741);
        myContacts.addNote("Andy", 809736584);
        myContacts.addNote("Ann", 806798529);
        myContacts.addNote("John", 806365640);
        myContacts.addNote("John", 380971234);

        System.out.println(myContacts.find("Ann"));
        System.out.println(myContacts.find("Alise"));

        System.out.println(myContacts.findAll("John"));
        System.out.println(myContacts.findAll("Alise"));

    }


}








