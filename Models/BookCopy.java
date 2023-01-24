package Models;

public class BookCopy {
    private int copyNum;
    private Book book;
    public Book getBook(){
        return book;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getTitle() {
        return book.getTitle();
    }
}
