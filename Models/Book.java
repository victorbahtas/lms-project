package Models;

import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private int maxCheckLength;
    private List<BookCopy> bookCopyList;
    private List<Author> authorList;
    
    
    public boolean isAvailable(){
           return bookCopyList.size()==0? return false: true;
    }
 
}
