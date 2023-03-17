import java.util.*;

public class AddressBook {
    public void toAdd(ArrayList<Contact> array) {
        AddressBookMain mainBook = new AddressBookMain();
        String option;
        do {
            Contact contact = new Contact();
            System.out.print("enter name- ");
            contact.setName(mainBook.input.next());
            System.out.print("enter lastname- ");
            contact.setLastname(mainBook.input.next());
            System.out.print("enter address- ");
            contact.setAddress(mainBook.input.next());
            System.out.print("enter state- ");
            contact.setState(mainBook.input.next());
            System.out.print("enter zip code- ");
            contact.setZip(mainBook.input.nextInt());
            System.out.print("enter contact- ");
            contact.setPhone(mainBook.input.nextInt());
            System.out.print("enter email- ");
            contact.setEmail(mainBook.input.next());
            array.add(contact);
            System.out.print("Do you want to add more (yes/no) - ");
            option = mainBook.input.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public void toEdit(ArrayList<Contact> array) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("what you want to edit :");
        System.out.print("name, lastname, address, state, contact - ");
        String choiceToEdit = mainBook.input.next();
        if (choiceToEdit.equals("name")) {
            System.out.print("whose name : ");
            String oldName = mainBook.input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldName.equals(array.get(j).getName())) {
                    System.out.print("enter new name : ");
                    String newName = mainBook.input.next();
                    array.get(j).setName(newName);
                }
            }
        }
        if (choiceToEdit.equals("lastname")) {
            System.out.print("whose lastname : ");
            String oldLastName = mainBook.input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldLastName.equals(array.get(j).getName())) {
                    System.out.print("enter new Lastname : ");
                    array.get(j).setLastname(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("address")) {
            System.out.print("whose address : ");
            String oldaddress = mainBook.input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldaddress.equals(array.get(j).getName())) {
                    System.out.print("enter new address : ");
                    array.get(j).setAddress(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("state")) {
            System.out.print("whose state : ");
            String oldstate = mainBook.input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldstate.equals(array.get(j).getName())) {
                    System.out.print("enter new state : ");
                    array.get(j).setState(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("phone")) {
            System.out.print("whose phone : ");
            String oldphone = mainBook.input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldphone.equals(array.get(j).getName())) {
                    System.out.print("enter new phone no. : ");
                    array.get(j).setPhone(mainBook.input.nextInt());
                }
            }
        }
    }

    public void toDelete(ArrayList<Contact> array) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.print("Enter the name you want to delete : ");
        String del = mainBook.input.next();
        System.out.println("Address book is now updated ");
        for (int i = 0; i < array.size(); i++) {
            if (del.equals(array.get(i).getName())) {
                array.remove(array.get(i));
            }
        }
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + " " + array.get(i).getLastname() + " " +
                    array.get(i).getAddress() + " " + array.get(i).getState() + " " +
                    array.get(i).getZip() + " " + array.get(i).getPhone() + " " + array.get(i).getEmail());
        }
        System.out.println("  *    *   ");
    }

    public void toPrint(ArrayList<Contact> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + " " + array.get(i).getLastname() + " " +
                    array.get(i).getAddress() + " " + array.get(i).getState() + " " +
                    array.get(i).getZip() + " " + array.get(i).getPhone() + " " + array.get(i).getEmail());
        }
    }
}