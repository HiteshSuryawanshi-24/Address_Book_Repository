package com.hitesh.Address_Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
//    Contact contact = new Contact();
    ArrayList<Contact> addressBookList = new ArrayList<>();
    void addContact(){
        Contact contact = new Contact();
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
        addressBookList.add(contact);
    }
//    void editContact(){
//        System.out.println("Enter the First Name to Check Contact :");
//        String name = sc.next();
//        if (name.equalsIgnoreCase(contact.getFirstname()))
//        {
//            System.out.println("Contact Found !");
//            System.out.println("Enter the First Name :");
//            contact.setFirstname(sc.next());
//            System.out.println("Enter the Last Name :");
//            contact.setLastname(sc.next());
//            System.out.println("Enter the Address :");
//            contact.setAddress(sc.next());
//            System.out.println("Enter the City :");
//            contact.setCity(sc.next());
//            System.out.println("Enter the State :");
//            contact.setState(sc.next());
//            System.out.println("Enter the ZipNo :");
//            contact.setZipno(sc.next());
//            System.out.println("Enter the MobileNo :");
//            contact.setMobileno(sc.next());
//            System.out.println("Enter the EmailId :");
//            contact.setEmailid(sc.next());
//
//        }else {
//            System.out.println("Contact Not Found !");
//        }
//    }
    void deleteContact(){
        System.out.println("Enter the FirstName to check Contact");
        String name = sc.next();
        for (int i=0 ; i < addressBookList.size(); i++)
        {
            Contact contact = addressBookList.get(i);
            if (name.equalsIgnoreCase(contact.getFirstname())){
                System.out.println("Contact Found !");
                addressBookList.remove(i);
                System.out.println("Contact Deleted Successfully !");
            }else {
                System.out.println("Contact Not Found !");
            }
        }
    }
    void showContact(){
        for (int i =0 ; i < addressBookList.size() ; i++ ){
            Contact contact = addressBookList.get(i);
            System.out.println(contact.toString());
        }
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("**WELCOME TO ADDRESS_BOOK MANAGER**");
            System.out.println("1.ADD NEW CONTACT\n2.EDIT CONTACT\n3.SHOW CONTACT\n4.DELETE CONTACT\n5.EXIT");
            System.out.println("Enter Your Choice No");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    //addressBook.editContact();
                    break;
                case 3:
                    addressBook.showContact();
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid Choice No");
            }
        }while (choice != 5);
    }
}
