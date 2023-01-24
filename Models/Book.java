package Models;

import java.util.List;

public class Book {
    private String title;
    private String isbn;
    private int maxCheckLength;
    private List<BookCopy> bookCopyList;
    private List<Author> authorList;
    public Book(String title, String isbn){
        this.title = title;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getMaxCheckLength() {
        return maxCheckLength;
    }

    public void setMaxCheckLength(int maxCheckLength) {
        this.maxCheckLength = maxCheckLength;
    }

    public List<BookCopy> getBookCopyList() {
        return bookCopyList;
    }

    public void setBookCopyList(List<BookCopy> bookCopyList) {
        this.bookCopyList = bookCopyList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
    private Book searchBook(String title) {
        for (BookCopy book : bookCopyList) {
            if (book.getTitle().equals(title)) {
                return book.getBook();
            }
        }
        return null;
    }
        public boolean isAvailable(){
           return bookCopyList.size()==0? return false: true;
    }
}

    

 
}
