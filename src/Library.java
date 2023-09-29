import java.util.*;
public class Library {
    private ArrayList<Book2> book2s;

    public Library()
    {
        book2s = new ArrayList <Book2>();
    }

    public void addBook(Book2 book)
    {
        book2s.add(book);
    }

    public void removeBook(Book2 book)
    {
        book2s.remove(book);
    }

    public ArrayList<Book2> getbooks()
    {
        return book2s;
    }



    
}
