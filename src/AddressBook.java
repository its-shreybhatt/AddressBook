import java.util.*;

public class AddressBook {

    public void toAdd(LinkedList<Contact> myList) {
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
            System.out.print("enter city- ");
            contact.setCity(mainBook.input.next());
            System.out.print("enter state- ");
            contact.setState(mainBook.input.next());
            System.out.print("enter zip code- ");
            contact.setZip(mainBook.input.nextInt());
            System.out.print("enter contact- ");
            contact.setPhone(mainBook.input.nextInt());
            System.out.print("enter email- ");
            contact.setEmail(mainBook.input.next());
//            if(myList.stream().anyMatch(match->contact.equals(match))){
            if (OverrideEquals(myList, contact)) {
                System.out.println("Details of this person already exists");
            } else myList.add(contact);
            System.out.print("Do you want to add more (yes/no) - ");
            option = mainBook.input.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public boolean OverrideEquals(LinkedList<Contact> myList, Object obj) {
        Contact contact = (Contact) obj;
        for (Contact value : myList) {
            if (contact.getName().equals(value.getName())) {
                if (contact.getLastname().equals(value.getLastname()) && contact.getAddress().equals(value.getAddress())
                        && contact.getCity().equals(value.getCity()) && contact.getState().equals(value.getState())
                        && contact.getZip() == value.getZip() && contact.getPhone() == value.getPhone()
                        && contact.getEmail().equals(value.getEmail())) {
                    return true;
                }
            }
        }
        return false;
//            myList.stream().forEach(value->{
//                if (contact.getName().equals(value.getName())) {
//                    if (contact.getLastname().equals(value.getLastname()) && contact.getAddress().equals(value.getAddress())
//                            && contact.getState().equals(value.getState()) && contact.getZip() == value.getZip()
//                            && contact.getPhone() == value.getPhone() && contact.getEmail().equals(value.getEmail()));
//                }
//            });
    }

    public void toEdit(LinkedList<Contact> myList) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.println("what you want to edit :");
        System.out.print("name, lastname, address, state, contact - ");
        String choiceToEdit = mainBook.input.next();
        if (choiceToEdit.equals("name")) {
            System.out.print("whose name : ");
            String oldName = mainBook.input.next();
            for (int j = 0; j < myList.size(); j++) {
                if (oldName.equals(myList.get(j).getName())) {
                    System.out.print("enter new name : ");
                    String newName = mainBook.input.next();
                    myList.get(j).setName(newName);
                }
            }
        }
        if (choiceToEdit.equals("lastname")) {
            System.out.print("whose lastname : ");
            String oldLastName = mainBook.input.next();
            for (int j = 0; j < myList.size(); j++) {
                if (oldLastName.equals(myList.get(j).getName())) {
                    System.out.print("enter new Lastname : ");
                    myList.get(j).setLastname(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("address")) {
            System.out.print("whose address : ");
            String oldAddress = mainBook.input.next();
            for (int j = 0; j < myList.size(); j++) {
                if (oldAddress.equals(myList.get(j).getName())) {
                    System.out.print("enter new address : ");
                    myList.get(j).setAddress(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("state")) {
            System.out.print("whose state : ");
            String oldState = mainBook.input.next();
            for (int j = 0; j < myList.size(); j++) {
                if (oldState.equals(myList.get(j).getName())) {
                    System.out.print("enter new state : ");
                    myList.get(j).setState(mainBook.input.next());
                }
            }
        }
        if (choiceToEdit.equals("phone")) {
            System.out.print("whose phone : ");
            String oldPhone = mainBook.input.next();
            for (int j = 0; j < myList.size(); j++) {
                if (oldPhone.equals(myList.get(j).getName())) {
                    System.out.print("enter new phone no. : ");
                    myList.get(j).setPhone(mainBook.input.nextInt());
                }
            }
        }
    }

    public void toDelete(LinkedList<Contact> myList) {
        AddressBookMain mainBook = new AddressBookMain();
        System.out.print("Enter the name you want to delete : ");
        String nameToDelete = mainBook.input.next();
        System.out.println("Address book is now updated ");
        for (int i = 0; i < myList.size(); i++) {
            if (nameToDelete.equals(myList.get(i).getName())) {
                myList.remove(myList.get(i));
            }
        }
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getName() + " " + myList.get(i).getLastname() + " " +
                    myList.get(i).getAddress() + " " + myList.get(i).getCity() + " " + myList.get(i).getState() + " " +
                    myList.get(i).getZip() + " " + myList.get(i).getPhone() + " " + myList.get(i).getEmail());
        }
        System.out.println("  *    *   ");
    }

    public void toPrint(LinkedList<Contact> myList) {
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i).getName() + " " + myList.get(i).getLastname() + " " +
                    myList.get(i).getAddress() + " " + myList.get(i).getCity() + " " + myList.get(i).getState() + " " +
                    myList.get(i).getZip() + " " + myList.get(i).getPhone() + " " + myList.get(i).getEmail());
        }
    }
}