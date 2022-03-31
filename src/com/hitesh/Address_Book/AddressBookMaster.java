package com.hitesh.Address_Book;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMaster {

    static Scanner sc = new Scanner(System.in);
    Map<String,AddressBook> addressBookMap = new HashMap<>();

    void addAddressBook(){
        System.out.println("**ADD NEW ADDRESS BOOK**");
        System.out.println("Enter New AddressBook Name : ");
        String addressBookName = sc.next();
        AddressBook addressBook = new AddressBook();
        addressBookMap.put(addressBookName,addressBook);
    }
    void displayAddressBook(){
        System.out.println(addressBookMap); // to verify Object are Created or Not
        System.out.println(addressBookMap.keySet()); //to check how many objects
    }
    void selectAddressBook(){
        displayAddressBook();
        System.out.println("Select Address Book : ");
        String addressBookName = sc.next();
        AddressBook addressBook = addressBookMap.get(addressBookName);
        addressBook.addressBookMenu(addressBook);
    }
    public void backupAddressBook() {
        try {
            String contactData = "";
            for (String key : addressBookMap.keySet()) {
                //System.out.println(key);
                Path filePath = Paths.get(key + ".txt");
                AddressBook addressBook = addressBookMap.get(key);
                for (Contact contact : addressBook.addressBookList) {
                    contactData = contactData + "\n" + contact.getFirstname() + "," + contact.getLastname() + "," + contact.getAddress() +
                            "," + contact.getCity() + "," + contact.getState() + "," + contact.getZipno() + "," +
                            contact.getMobileno() + "," + contact.getEmailid();
                }
                byte[] data = contactData.getBytes();
                Files.write(filePath, data);
                contactData = "";
            }
        } catch (IOException ioe) {}
    }
    public void restoreAddressBook()throws IOException {
        System.out.println("Enter the Addressbook Name to Restore : ");
        String addressBookName = sc.next();
        try {
            BufferedReader br = new BufferedReader(new FileReader(addressBookName+".txt"));
            String line;
            AddressBook addressBook = new AddressBook();
            while((line = br.readLine())!=null) {
                System.out.println(line);
                String[] contacData = line.split(",");
                Contact contact = new Contact();
                contact.setFirstname(contacData[0]);
                contact.setLastname(contacData[1]);
                contact.setAddress(contacData[2]);
                contact.setCity(contacData[3]);
                contact.setState(contacData[4]);
                contact.setZipno(contacData[5]);
                contact.setMobileno(contacData[6]);
                contact.setEmailid(contacData[7]);
                addressBook.addressBookList.add(contact);
            }
            addressBookMap.put(addressBookName,addressBook);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        int choice;
        AddressBookMaster addressBookMaster = new AddressBookMaster();
        do {
            System.out.println("***ADDRESS BOOK MANAGER***");
            System.out.println("1.ADD NEW ADDRESS BOOK\n2.EDIT ADDRESS BOOK\n3.DISPLAY ADDRESS BOOK\n" +
                    "4.SELECT ADDRESS BOOK\n5.BACKUP\n6.RESTORE\n7.EXIT");
            System.out.println("Enter the Operation No : ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    addressBookMaster.addAddressBook();
                    break;
                case 2:
                    break;
                case 3:
                    addressBookMaster.displayAddressBook();
                    break;
                case 4:
                    addressBookMaster.selectAddressBook();
                    break;
                case 5:
                    addressBookMaster.backupAddressBook();
                    break;
                case 6:
                    addressBookMaster.restoreAddressBook();
                    break;

                default:
                    System.out.println("Invalid Operation No:");
                    break;
            }
        }while (choice !=7);
    }
}
