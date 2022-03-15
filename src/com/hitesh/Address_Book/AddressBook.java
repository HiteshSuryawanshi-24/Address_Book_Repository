package com.hitesh.Address_Book;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();

    void addContact(){
        System.out.println("Enter the First Name :");
        contact.setFirstname(sc.next());
        System.out.println("Enter the Last Name :");
        contact.setLastname(sc.next());
        System.out.println("Enter the Address :");
        contact.setAddress(sc.next());
        System.out.println("Enter the City :");
        contact.setCity(sc.next());
        System.out.println("Enter the State :");
        contact.setState(sc.next());
        System.out.println("Enter the ZipNo :");
        contact.setZipno(sc.next());
        System.out.println("Enter the MobileNo :");
        contact.setMobileno(sc.next());
        System.out.println("Enter the EmailId :");
        contact.setEmailid(sc.next());
    }
    void showContact(){
        System.out.println("Contact List :");
        System.out.println(contact.toString());
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.addContact();
        addressBook.showContact();
    }
}
