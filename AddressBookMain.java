package DAY10;

import java.util.*;

public class AddressBookMain {

    // ContactPerson class (UC1)
    static class ContactPerson {
        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zip;
        private String phoneNumber;
        private String email;

        public ContactPerson(String firstName, String lastName, String address,
                             String city, String state, String zip,
                             String phoneNumber, String email) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.city = city;
            this.state = state;
            this.zip = zip;
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getFirstName() { return firstName; }
        public String getLastName() { return lastName; }

        public void setAddress(String address) { this.address = address; }
        public void setCity(String city) { this.city = city; }
        public void setState(String state) { this.state = state; }
        public void setZip(String zip) { this.zip = zip; }
        public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
        public void setEmail(String email) { this.email = email; }

        @Override
        public String toString() {
            return firstName + " " + lastName + " | " + address + ", " + city + ", " + state +
                    " - " + zip + " | Phone: " + phoneNumber + " | Email: " + email;
        }
    }

    // AddressBook class (UC2–UC4)
    static class AddressBook {
        private List<ContactPerson> contacts = new ArrayList<>();

        public void addContact(ContactPerson contact) {
            contacts.add(contact);
        }

        public boolean editContact(String firstName, Scanner sc) {
            for (ContactPerson c : contacts) {
                if (c.getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.println("Editing contact: " + c);
                    System.out.print("Enter new city: ");
                    c.setCity(sc.nextLine());
                    System.out.print("Enter new state: ");
                    c.setState(sc.nextLine());
                    System.out.print("Enter new zip: ");
                    c.setZip(sc.nextLine());
                    System.out.print("Enter new phone: ");
                    c.setPhoneNumber(sc.nextLine());
                    System.out.print("Enter new email: ");
                    c.setEmail(sc.nextLine());
                    return true;
                }
            }
            return false;
        }

        public boolean deleteContact(String firstName) {
            return contacts.removeIf(c -> c.getFirstName().equalsIgnoreCase(firstName));
        }

        public void displayContacts() {
            if (contacts.isEmpty()) {
                System.out.println("No contacts found.");
            } else {
                for (ContactPerson c : contacts) {
                    System.out.println(c);
                }
            }
        }
    }

    // UC6: Multiple Address Books
    private static Map<String, AddressBook> addressBooks = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address Book Program");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Display All Address Books");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Address Book Name: ");
                    String bookName = sc.nextLine();
                    if (addressBooks.containsKey(bookName)) {
                        System.out.println("Address Book already exists!");
                    } else {
                        addressBooks.put(bookName, new AddressBook());
                        System.out.println("Address Book '" + bookName + "' created.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Address Book Name: ");
                    String selectName = sc.nextLine();
                    AddressBook selectedBook = addressBooks.get(selectName);
                    if (selectedBook == null) {
                        System.out.println("Address Book not found.");
                    } else {
                        manageAddressBook(selectedBook, sc);
                    }
                    break;

                case 3:
                    if (addressBooks.isEmpty()) {
                        System.out.println("No Address Books created yet.");
                    } else {
                        System.out.println("Available Address Books:");
                        for (String name : addressBooks.keySet()) {
                            System.out.println("- " + name);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

    // Manage contacts inside a selected AddressBook
    private static void manageAddressBook(AddressBook addressBook, Scanner sc) {
        boolean back = false;
        while (!back) {
            System.out.println("\nManage Address Book:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Back");

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
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();

                    ContactPerson contact = new ContactPerson(firstName, lastName, address, city, state, zip, phone, email);
                    addressBook.addContact(contact);
                    break;

                case 2:
                    System.out.print("Enter First Name of contact to edit: ");
                    String editName = sc.nextLine();
                    if (!addressBook.editContact(editName, sc)) {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter First Name of contact to delete: ");
                    String deleteName = sc.nextLine();
                    if (addressBook.deleteContact(deleteName)) {
                        System.out.println("Contact deleted.");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    addressBook.displayContacts();
                    break;

                case 5:
                    back = true;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

