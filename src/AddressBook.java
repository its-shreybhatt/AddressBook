public class AddressBook {
    public static void main(String[] args) {
        System.out.println(" Welcome to Address Book Program !! ");
        Contact contact = new Contact();

        contact.name = "Shrey";
        contact.lastname = "Bhatt";
        contact.address = "Dehradun Colony";
        contact.state = "Uttarakhand";
        contact.zip = 248001;
        contact.phone = 9876;
        contact.email = "shrey@123.com";

        System.out.println(contact.name + " " + contact.lastname + " " + contact.address + " "
                + contact.state + " " + contact.zip + " " + contact.phone + " " + contact.email);
    }
}