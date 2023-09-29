public class Exceptions {
    public static void main(String[] args) {
        int a=2;
        int b=0;
        try
        {
            System.out.println(a/b);
        }
        catch(Exception e)
        {
            System.out.println("This is a math error!!!");
        }
    }
    
}
