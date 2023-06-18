public class oopintro {
   final int x=5;
    int y=5;
    String fname="Richard";
    String lname="Roe";
    public static void main(String[] args)
    {
        oopintro myObj=new oopintro();
        myObj.y=40;
        System.out.println(myObj.y);
        System.out.println(myObj.x);
        System.out.println("Name: "+ myObj.fname+ " "+myObj.lname);
        System.out.println("Age: "+myObj.y);
    }
}
