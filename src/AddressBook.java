import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");

        Scanner input = new Scanner(System.in);
        System.out.println("number of person :");
        int person = input.nextInt();
        Contact[] array = new Contact[person];
        for (int i = 0; i < person; i++) {
            System.out.println("enter " + (i + 1) + " person name-");
            String name = input.next();
            System.out.println("enter " + (i + 1) + " person lastname-");
            String lastname = input.next();
            System.out.println("enter " + (i + 1) + " person address-");
            String address = input.next();
            System.out.println("enter " + (i + 1) + " person state-");
            String state = input.next();
            System.out.println("enter " + (i + 1) + " person zip code-");
            int zip = input.nextInt();
            System.out.println("enter " + (i + 1) + " person contact-");
            int phone = input.nextInt();
            System.out.println("enter " + (i + 1) + " person email-");
            String email = input.next();
            Contact contact = new Contact(name, lastname, address, state, zip, phone, email);
            array[i] = contact;
        }

        for (int i = 0; i < person; i++) {
            System.out.println(array[i].name + " " + array[i].lastname + " " + array[i].address + " "
                    + array[i].state + " " + array[i].zip + " " + array[i].phone + " " + array[i].email);
        }
    }
}