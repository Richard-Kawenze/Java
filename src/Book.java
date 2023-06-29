import java.util.ArrayList;
public class Book {
    private String title;
    private String author;
    private String isbn;
    private static ArrayList<Book>bookCollection =new ArrayList<Book>();

    public Book(String title,String author, String isbn)
    {
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }
    public String getAuthor()
    {
        return author;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public String getIsbn()
    {
        return isbn;
    }
    public void setIsbn(String isbn)
    {
        this.isbn=isbn;
    }
    public static void addBook(Book book)
    {
        bookCollection.add(book);
    }
    public static void removeBook(Book book)
    {
        bookCollection.remove(book);
    }

    public static ArrayList<Book>getBookcollection()
    {
        return bookCollection;
    }

    public static void main(String[] args)
    {
        Book book1=new Book("Java Programming","Richard","89657");
        Book book2=new Book("C Programming", "Dennis Ritchie", "78756");
        Book.addBook(book1);
        Book.addBook(book2);
        ArrayList<Book>bookCollection=Book.getBookcollection();
        System.out.println("List of Books:");
        for(Book book:bookCollection)
        {
             System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());
        }
         System.out.println("\nAfter removing " + book1.getTitle() + ":");
    System.out.println("List of books:");
    for (Book book: bookCollection) {
      System.out.println(book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn());

    }

    
}
}
