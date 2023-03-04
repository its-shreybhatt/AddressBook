import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");

        ArrayList<Contact> array = new ArrayList<>();
        String choice = "Null";
        while (!choice.equalsIgnoreCase("stop")) {
            System.out.println("What do you want to perform");
            System.out.println("ADD , Edit , Delete , Print , Stop");
            choice = input.next();
            switch (choice) {
                case "add":
                    toAdd(array);
                    break;
                case "edit":
                    toEdit(array);
                    break;
                case "delete":
                    toDelete(array);
                    break;
                case "print":
                    toPrint(array);
                    break;
                case "stop":
                    toStop();
                    break;
            }
        }
    }

    public static void toAdd(ArrayList<Contact> array) {
        String option;
        do {
            Contact contact = new Contact();
            System.out.println("enter name-");
            contact.setName(input.next());
            System.out.println("enter lastname-");
            contact.setLastname(input.next());
            System.out.println("enter address-");
            contact.setAddress(input.next());
            System.out.println("enter state-");
            contact.setState(input.next());
            System.out.println("enter zip code-");
            contact.setZip(input.nextInt());
            System.out.println("enter contact-");
            contact.setPhone(input.nextInt());
            System.out.println("enter email-");
            contact.setEmail(input.next());
            array.add(contact);
            System.out.println("Do you want to add more (yes/no) ");
            option = input.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public static void toEdit(ArrayList<Contact> array) {
        System.out.println("what you want to edit :");
        System.out.println("name, lastname, address, state, contact");
        String choiceToEdit = input.next();
        if (choiceToEdit.equals("name")) {
            System.out.println("whose name :");
            String oldName = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldName.equals(array.get(j).getName())) {
                    System.out.println("enter new name :");
                    String newName = input.next();
                    array.get(j).setName(newName);
                }
            }
        }
        if (choiceToEdit.equals("lastname")) {
            System.out.println("whose lastname :");
            String oldLastName = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldLastName.equals(array.get(j).getName())) {
                    System.out.println("enter new Lastname :");
                    array.get(j).setLastname(input.next());
                }
            }
        }
        if (choiceToEdit.equals("address")) {
            System.out.println("whose address :");
            String oldaddress = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldaddress.equals(array.get(j).getName())) {
                    System.out.println("enter new address :");
                    array.get(j).setAddress(input.next());
                }
            }
        }
        if (choiceToEdit.equals("state")) {
            System.out.println("whose state :");
            String oldstate = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldstate.equals(array.get(j).getName())) {
                    System.out.println("enter new state :");
                    array.get(j).setState(input.next());
                }
            }
        }
        if (choiceToEdit.equals("phone")) {
            System.out.println("whose phone :");
            String oldphone = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldphone.equals(array.get(j).getName())) {
                    System.out.println("enter new phone no. :");
                    array.get(j).setPhone(input.nextInt());
                }
            }
        }
    }

    public static void toDelete(ArrayList<Contact> array) {
        System.out.println("Enter the name you want to delete : ");
        String del = input.next();
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

    public static void toPrint(ArrayList<Contact> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).getName() + " " + array.get(i).getLastname() + " " +
                    array.get(i).getAddress() + " " + array.get(i).getState() + " " +
                    array.get(i).getZip() + " " + array.get(i).getPhone() + " " + array.get(i).getEmail());
        }
    }

    public static void toStop() {
        System.out.println("Thank you");
    }
}