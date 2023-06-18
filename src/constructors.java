public class constructors {
    int x;
    int y;
    String fname;

    public constructors(int a,String b)
    {
        x=50;
        y=a;
        fname=b;
    }

    public static void main(String[] args)
    {
        constructors myObj=new constructors(55,"Richard");
        System.out.println(myObj.y);
        System.out.println(myObj.fname);
    }

    
}
