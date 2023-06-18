public class methods {
    static void mymethod()
    {
        System.out.println("Hello World");
    }
    public void mymethod2()
    {
        System.out.println("Hello there");
    }
    public static void main(String[] args)
    {
        mymethod();
        methods myObj= new methods();
        myObj.mymethod2();
    }
    
}
