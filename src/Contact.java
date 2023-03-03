public class Contact {
    String name;
    String lastname;
    String address;
    String state;
    int zip;
    int phone;
    String email;

    public Contact(String name, String lastname, String address,
                   String state, int zip, int phone, String email) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
}
