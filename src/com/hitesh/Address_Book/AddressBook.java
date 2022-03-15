package com.hitesh.Address_Book;

import java.util.Scanner;

public class AddressBook {
    static Scanner sc = new Scanner(System.in);
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
    void editContact(){
        System.out.println("Enter the First Name to Check Contact :");
        String name = sc.next();
        if (name.equalsIgnoreCase(contact.getFirstname()))
        {
            System.out.println("Contact Found !");
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

        }else {
            System.out.println("Contact Not Found !");
        }
    }
    void showContact(){
        System.out.println("Contact List :");
        System.out.println(contact.toString());
    }
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        int choice;
        do {
            System.out.println("**WELCOME TO ADDRESS_BOOK MANAGER**");
            System.out.println("1.ADD NEW CONTACT\n2.EDIT CONTACT\n3.SHOW CONTACT\n4.EXIT");
            System.out.println("Enter Your Choice No");
            choice =sc.nextInt();
            switch (choice){
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.showContact();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid Choice No");
            }
        }while (choice != 4);

    }
}
