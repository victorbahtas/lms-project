package Models;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Admin extends Person {
    public Admin(String firstName, String lastName, Address address, Account account) {
        super(firstName, lastName, address, account);
    }

    public static void addNewMember(Member m) {
        try {
            FileOutputStream file = new FileOutputStream("Members.data");
            ObjectOutputStream output = new ObjectOutputStream(file);
            output.writeObject(m);
            System.out.println("Object saved in data");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
