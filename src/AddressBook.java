import java.util.*;

public class AddressBook {
    static Scanner input = new Scanner(System.in);
    static HashMap<String, ArrayList<Contact>> map = new HashMap<>();
    static String bookName;

    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");
        String diffAddressBook = "continue";
        while (!diffAddressBook.equalsIgnoreCase("no")) {
            System.out.print("Enter the name of Address Book - ");
            bookName = input.next();

            ArrayList<Contact> array = new ArrayList<>();

            String choice = "None";
            while (!choice.equalsIgnoreCase("stop")) {
                Contact obj = new Contact();
                System.out.println("What do you want to perform");
                System.out.print("ADD , Edit , Delete , Print , Stop this book - ");
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
                        System.out.println("\nThank You for " + bookName + " Book ");
                        break;
                }
                map.put(bookName, array);
            }
            System.out.println("This address book is -> " + bookName);
            printHashMap(array);
            System.out.print("Do you want to add new book - yes /no -");
            diffAddressBook = input.next();
        }

        System.out.print("Do you want to print Final AddressBook (Yes/No) -");
        String option = input.next();
        switch (option) {
            case "yes":
                for (Map.Entry<String, ArrayList<Contact>> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + " -> ");
                    for (int i = 0; i < map.size(); i++) {
                        System.out.println(entry.getValue().get(i).getName() + " "
                                + entry.getValue().get(i).getLastname() + " " + entry.getValue().get(i).getAddress() + " "
                                + entry.getValue().get(i).getState() + " " + entry.getValue().get(i).getZip() + " "
                                + entry.getValue().get(i).getPhone() + " " + entry.getValue().get(i).getEmail());
                    }
                }
                break;
            case "no":
                System.out.println("<  Thank You >");
                break;
        }
    }

    public static void toAdd(ArrayList<Contact> array) {
        String option;
        do {
            Contact contact = new Contact();
            System.out.print("enter name- ");
            contact.setName(input.next());
            System.out.print("enter lastname- ");
            contact.setLastname(input.next());
            System.out.print("enter address- ");
            contact.setAddress(input.next());
            System.out.print("enter state- ");
            contact.setState(input.next());
            System.out.print("enter zip code- ");
            contact.setZip(input.nextInt());
            System.out.print("enter contact- ");
            contact.setPhone(input.nextInt());
            System.out.print("enter email- ");
            contact.setEmail(input.next());
            array.add(contact);
            System.out.print("Do you want to add more (yes/no) - ");
            option = input.next();
        } while (!option.equalsIgnoreCase("no"));
    }

    public static void toEdit(ArrayList<Contact> array) {
        System.out.println("what you want to edit :");
        System.out.print("name, lastname, address, state, contact - ");
        String choiceToEdit = input.next();
        if (choiceToEdit.equals("name")) {
            System.out.print("whose name : ");
            String oldName = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldName.equals(array.get(j).getName())) {
                    System.out.print("enter new name : ");
                    String newName = input.next();
                    array.get(j).setName(newName);
                }
            }
        }
        if (choiceToEdit.equals("lastname")) {
            System.out.print("whose lastname : ");
            String oldLastName = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldLastName.equals(array.get(j).getName())) {
                    System.out.print("enter new Lastname : ");
                    array.get(j).setLastname(input.next());
                }
            }
        }
        if (choiceToEdit.equals("address")) {
            System.out.print("whose address : ");
            String oldaddress = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldaddress.equals(array.get(j).getName())) {
                    System.out.print("enter new address : ");
                    array.get(j).setAddress(input.next());
                }
            }
        }
        if (choiceToEdit.equals("state")) {
            System.out.print("whose state : ");
            String oldstate = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldstate.equals(array.get(j).getName())) {
                    System.out.print("enter new state : ");
                    array.get(j).setState(input.next());
                }
            }
        }
        if (choiceToEdit.equals("phone")) {
            System.out.print("whose phone : ");
            String oldphone = input.next();
            for (int j = 0; j < array.size(); j++) {
                if (oldphone.equals(array.get(j).getName())) {
                    System.out.print("enter new phone no. : ");
                    array.get(j).setPhone(input.nextInt());
                }
            }
        }
    }

    public static void toDelete(ArrayList<Contact> array) {
        System.out.print("Enter the name you want to delete : ");
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

    public static void printHashMap(ArrayList<Contact> array) {
        for (int j = 0; j < array.size(); j++) {
            System.out.println(map.get(bookName).get(j).getName() + " " +
                    map.get(bookName).get(j).getLastname() + " " + map.get(bookName).get(j).getAddress() + " " +
                    map.get(bookName).get(j).getState() + " " + map.get(bookName).get(j).getZip() + " " +
                    map.get(bookName).get(j).getPhone() + " " + map.get(bookName).get(j).getEmail());
        }
        System.out.println();
    }
}