import java.util.Scanner;

public class AddressBook {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");
        System.out.println("number of person :");
        int person = input.nextInt();
        Contact[] array = new Contact[person];
        int result = 0;
        while (result != 4) {
            System.out.println("What do you want to perform");
            System.out.println("1.ADD , 2.Edit , 3.Print , 4.Stop");
            result = input.nextInt();
            switch (result) {
                case 1:
                    add(person,array);
                    break;
                case 2:
                    edit(person,array);
                    break;
                case 3:
                    print(person,array);
                    break;
                case 4:
                    stop();
                    break;
            }
        }
    }

    public static void add(int person, Contact[] array) {

        for (int i = 0; i < person; i++) {
            Contact contact = new Contact();
            System.out.println("enter " + (i + 1) + " person name-");
            contact.setName(input.next());
            System.out.println("enter " + (i + 1) + " person lastname-");
            contact.setLastname(input.next());
            System.out.println("enter " + (i + 1) + " person address-");
            contact.setAddress(input.next());
            System.out.println("enter " + (i + 1) + " person state-");
            contact.setState(input.next());
            System.out.println("enter " + (i + 1) + " person zip code-");
            contact.setZip(input.nextInt());
            System.out.println("enter " + (i + 1) + " person contact-");
            contact.setPhone(input.nextInt());
            System.out.println("enter " + (i + 1) + " person email-");
            contact.setEmail(input.next());
            array[i] = contact;
        }
    }

    public static void edit(int person, Contact[] array) {
        System.out.println("what you want to edit :");
        System.out.println("name, lastname, address, state, contact");
        String toEdit = input.next();
        if (toEdit.equals("name")) {
            System.out.println("whose name :");
            String oldName = input.next();
            for (int j = 0; j < person; j++) {
                if (oldName.equals(array[j].getName())) {
                    System.out.println("enter new name :");
                    String newName=input.next();
                    array[j].setName(newName);
                }
            }
        }
        if (toEdit.equals("lastname")) {
            System.out.println("whose lastname :");
            String oldLastName = input.next();
            for (int j = 0; j < person; j++) {
                if (oldLastName.equals(array[j].getName())) {
                    System.out.println("enter new Lastname :");
                    array[j].setLastname(input.next());
                }
            }
        }
        if (toEdit.equals("address")) {
            System.out.println("whose address :");
            String oldaddress = input.next();
            for (int j = 0; j < person; j++) {
                if (oldaddress.equals(array[j].getName())) {
                    System.out.println("enter new address :");
                    array[j].setAddress(input.next());
                }
            }
        }
        if (toEdit.equals("state")) {
            System.out.println("whose state :");
            String oldstate = input.next();
            for (int j = 0; j < person; j++) {
                if (oldstate.equals(array[j].getName())) {
                    System.out.println("enter new state :");
                    array[j].setState(input.next());
                }
            }
        }
        if (toEdit.equals("phone")) {
            System.out.println("whose phone :");
            String oldphone = input.next();
            for (int j = 0; j < person; j++) {
                if (oldphone.equals(array[j].getName())) {
                    System.out.println("enter new phone no. :");
                    array[j].setPhone(input.nextInt());
                }
            }
        }
    }

    public static void print(int person, Contact[] array) {
        for (int i = 0; i < person; i++) {
            System.out.println(array[i].getName() + " " + array[i].getLastname() + " " + array[i].getAddress() + " "
                    + array[i].getState() + " " + array[i].getZip() + " " + array[i].getPhone() + " " + array[i].getEmail());
        }
    }

    public static void stop() {
        System.out.println("Thank you");
    }
}