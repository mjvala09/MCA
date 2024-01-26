class Book{
    String bookName, ISBNNumber, authorName, publisher;

    Book(String bookName, String ISBNNumber, String authorName, String publisher){
        this.bookName = bookName;
        this.ISBNNumber = ISBNNumber;
        this.authorName = authorName;
        this.publisher = publisher;
    }
    

}
class BookTest{
    public static void main(String[] args) {
        Book b1 = new Book();
    }
}