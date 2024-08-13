package MPP_Week4_Final_Practice;

class BookCopy {
    private Book book;

    public BookCopy(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public BookCopy getNextAvailableCopy() {
        // Logic to return the next available copy
        return this;
    }
}