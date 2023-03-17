import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static Constants.Constants.*;

public class HashMapClass {
    public void addBook(HashMap<String, ArrayList<Contact>> map) {
        AddressBookMain mainBook = new AddressBookMain();
        AddressBook addressBook = new AddressBook();
        ArrayList<Contact> array = new ArrayList<>();
        System.out.print("Enter the name of Address Book - ");
        String bookName = mainBook.input.next();
        if (map.containsKey(bookName)) {
            System.out.println("Name already exists ");
            System.out.println("Entered to " + bookName + " book ");
            addressBook.toAdd(map.get(bookName));

        } else {
            int choice = 0;
            while (choice != 5) {
                System.out.println("What do you want to perform (Inside " + bookName + " book)");
                System.out.print("1.ADD , 2.Edit , 3.Delete , 4.Print , 5.Stop this book - ");
                choice = mainBook.input.nextInt();
                switch (choice) {
                    case TO_ADD_CONTACT:
                        addressBook.toAdd(array);
                        break;
                    case TO_EDIT_CONTACT:
                        addressBook.toEdit(array);
                        break;
                    case TO_DEL_CONTACT:
                        addressBook.toDelete(array);
                        break;
                    case TO_PRINT:
                        addressBook.toPrint(array);
                        break;
                    case TO_STOP_BOOK:
                        System.out.println("\nThank You for " + bookName + " Book \n");
                        break;
                }
                map.put(bookName, array);
            }
        }
    }

    public void toEdit(HashMap<String, ArrayList<Contact>> map) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("enter the name of book");
        String bookName = mainBook.input.next();
        if (!map.containsKey(bookName)) {
            System.out.println(bookName + " Book does not exists ");
        } else {
            ArrayList<Contact> contactArrayList = map.get(bookName);

            System.out.println("what you want to edit :");
            System.out.print("name, lastname, address, state, contact - ");
            String choiceToEdit = mainBook.input.next();
            if (choiceToEdit.equals("name")) {
                System.out.print("whose name : ");
                String oldName = mainBook.input.next();
                for (int j = 0; j < contactArrayList.size(); j++) {
                    if (oldName.equals(contactArrayList.get(j).getName())) {
                        System.out.print("enter new name : ");
                        String newName = mainBook.input.next();
                        contactArrayList.get(j).setName(newName);
                    }
                }
            }
            if (choiceToEdit.equals("lastname")) {
                System.out.print("whose lastname : ");
                String oldLastName = mainBook.input.next();
                for (int j = 0; j < contactArrayList.size(); j++) {
                    if (oldLastName.equals(contactArrayList.get(j).getName())) {
                        System.out.print("enter new Lastname : ");
                        contactArrayList.get(j).setLastname(mainBook.input.next());
                    }
                }
            }
            if (choiceToEdit.equals("address")) {
                System.out.print("whose address : ");
                String oldaddress = mainBook.input.next();
                for (int j = 0; j < contactArrayList.size(); j++) {
                    if (oldaddress.equals(contactArrayList.get(j).getName())) {
                        System.out.print("enter new address : ");
                        contactArrayList.get(j).setAddress(mainBook.input.next());
                    }
                }
            }
            if (choiceToEdit.equals("state")) {
                System.out.print("whose state : ");
                String oldstate = mainBook.input.next();
                for (int j = 0; j < contactArrayList.size(); j++) {
                    if (oldstate.equals(contactArrayList.get(j).getName())) {
                        System.out.print("enter new state : ");
                        contactArrayList.get(j).setState(mainBook.input.next());
                    }
                }
            }
            if (choiceToEdit.equals("phone")) {
                System.out.print("whose phone : ");
                String oldphone = mainBook.input.next();
                for (int j = 0; j < contactArrayList.size(); j++) {
                    if (oldphone.equals(contactArrayList.get(j).getName())) {
                        System.out.print("enter new phone no. : ");
                        contactArrayList.get(j).setPhone(mainBook.input.nextInt());
                    }
                }
            }
        }
    }

    public void deleteBook(HashMap<String, ArrayList<Contact>> map) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("enter the name of book");
        String bookName = mainBook.input.next();
        if (!map.containsKey(bookName)) {
            System.out.println(bookName + " Book does not exists ");
        } else {
            ArrayList<Contact> contactArrayList = map.get(bookName);
            System.out.print("Enter the name you want to delete : ");
            String del = mainBook.input.next();
            System.out.println("Address book is now updated ");
            for (int i = 0; i < contactArrayList.size(); i++) {
                if (del.equals(contactArrayList.get(i).getName())) {
                    contactArrayList.remove(contactArrayList.get(i));
                }
            }
            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.println(contactArrayList.get(i).getName() + " " + contactArrayList.get(i).getLastname() + " " +
                        contactArrayList.get(i).getAddress() + " " + contactArrayList.get(i).getState() + " " +
                        contactArrayList.get(i).getZip() + " " + contactArrayList.get(i).getPhone() + " " + contactArrayList.get(i).getEmail());
            }
            System.out.println("  *    *   ");
        }
    }

    public void listOfBookNames(HashMap<String, ArrayList<Contact>> map) {
        System.out.println("\nList of All Book are ->");
        for (Map.Entry<String, ArrayList<Contact>> entry : map.entrySet()) {
            System.out.print("* " + entry.getKey() + " Book -->   ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.print(entry.getValue().get(i).getName() + " " + entry.getValue().get(i).getLastname() + " , ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void searchWithName(HashMap<String, ArrayList<Contact>> map) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("enter the name you want to search ");
        String contactName = mainBook.input.next();
        int count = 0;
        for (Map.Entry<String, ArrayList<Contact>> entry : map.entrySet()) {
            System.out.print("BookName = ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                if (entry.getValue().get(i).getName().equals(contactName)) {
                    System.out.print(entry.getKey() + " , ");
                    count += 1;
                }
            }
        }
        if (count >= 1) {
            System.out.println("  Total number of times " + contactName + " occured = " + count);
        } else {
            System.out.println("Name " + contactName + " does not exists ");
        }
        System.out.println();
    }

    public void particularBookName(HashMap<String, ArrayList<Contact>> map) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("enter the name of book");
        String bookName = mainBook.input.next();
        if (!map.containsKey(bookName)) {
            System.out.println("Please enter correct address book");
        } else {
            ArrayList<Contact> contactArrayList = map.get(bookName);
            for (int i = 0; i < contactArrayList.size(); i++) {
                System.out.println(contactArrayList.get(i).getName() + " " + contactArrayList.get(i).getLastname() + " " +
                        contactArrayList.get(i).getAddress() + " " + contactArrayList.get(i).getState() + " " +
                        contactArrayList.get(i).getZip() + " " + contactArrayList.get(i).getPhone() + " " + contactArrayList.get(i).getEmail());
            }
        }
    }

    public void printMap(HashMap<String, ArrayList<Contact>> map) {
        for (Map.Entry<String, ArrayList<Contact>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> ");
            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println(entry.getValue().get(i).getName() + " "
                        + entry.getValue().get(i).getLastname() + " " + entry.getValue().get(i).getAddress() + " "
                        + entry.getValue().get(i).getState() + " " + entry.getValue().get(i).getZip() + " "
                        + entry.getValue().get(i).getPhone() + " " + entry.getValue().get(i).getEmail());
            }
        }
    }
}
