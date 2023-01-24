package Models;

import java.io.Serializable;
import java.util.List;

public class Member extends Person implements Serializable {
    private String memberId;
    private  List<CheckoutRecord> checkOutRecord;
}
