package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args){
        System.out.println("Welcome To Address Book System");
        ContactDetails person = new ContactDetails();

        person.setFirstName("Shweta");
        person.setLastName("Prasad");
        person.setAddress("Hinjewadi Phase1");
        person.setCity("Pune");
        person.setState("Maharashtra");
        person.setZip(411057);
        person.setPhoneNumber("7894561230");
        person.setEmail("shwetaprasad48@gmail.com");

        System.out.println(person);
    }
}

