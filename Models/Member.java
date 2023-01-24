package Models;

import java.io.Serializable;
import java.util.List;

public class Member extends Person implements Serializable {
    public Member(String fname, String lname, Address address, Account acct) {
        super(fname,lname,address,acct);
    }
    private String memberId;
    private  List<CheckoutRecord> checkOutRecord;
}

