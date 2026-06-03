package DAY09;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    static class Contact {
        String firstName, lastName, address, city, state, zip, phoneNumber, email;

        Contact(String firstName, String lastName, String address, String city,
                String state, String zip, String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " | " + address + ", " + city + ", " + state +
                    " - " + zip + " | Phone: " + phoneNumber + " | Email: " + email;
        }
    }

    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added successfully!");
    }

    public void editContact(String name, Scanner sc) {
        for (Contact c : contacts) {
            if (c.firstName.equalsIgnoreCase(name)) {
                System.out.println("Editing contact: " + c);
                System.out.print("Enter new address: ");
                c.address = sc.nextLine();
                System.out.print("Enter new city: ");
                c.city = sc.nextLine();
                System.out.print("Enter new state: ");
                c.state = sc.nextLine();
                System.out.print("Enter new zip: ");
                c.zip = sc.nextLine();
                System.out.print("Enter new phone number: ");
                c.phoneNumber = sc.nextLine();
                System.out.print("Enter new email: ");
                c.email = sc.nextLine();
                System.out.println("Contact updated successfully!");
                return;
            }
        }
        System.out.println("Contact not found!");
    }

    public void deleteContact(String name) {
        contacts.removeIf(c -> c.firstName.equalsIgnoreCase(name));
        System.out.println("Contact deleted successfully (if existed).");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("Contacts in Address Book:");
            for (Contact c : contacts) {
                System.out.println(c);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner sc = new Scanner(System.in);
        AddressBookMain ab = new AddressBookMain();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = sc.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    System.out.print("Enter State: ");
                    String state = sc.nextLine();
                    System.out.print("Enter Zip: ");
                    String zip = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    ab.addContact(new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email));
                    break;

                case 2:
                    System.out.print("Enter First Name of contact to edit: ");
                    ab.editContact(sc.nextLine(), sc);
                    break;

                case 3:
                    System.out.print("Enter First Name of contact to delete: ");
                    ab.deleteContact(sc.nextLine());
                    break;

                case 4:
                    ab.displayContacts();
                    break;

                case 5:
                    System.out.println("Thank You");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

