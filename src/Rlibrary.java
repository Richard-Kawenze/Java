public class Rlibrary {
    public static void main(String[] args) {
        Library library1=new Library();

        Book2 bookone=new Book2("The Nun","The Pastor");
        Book2 booktwo=new Book2("The prison", "The Police");

        library1.addbook(bookone);
        library1.addbook(booktwo);

        System.out.println("Here is the list of the books in the library: ");
        for(Book2 book:library1.getbooks())
        {
            System.out.println(book2s.getTitle()+" by "+book2s.getAuthor());
        }
    }
    
}
