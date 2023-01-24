

package Models;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private Account account;

    public Person(String firstName, String lastName, Address address, Account account) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.account = account;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
