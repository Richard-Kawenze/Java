public class oop {
    String name;
    int age;
    private String last;

    //Getter
    public String getLast()
    {
        return last;
    }
    //Setter
    public void setLast(String newLast)
    {
        this.last=newLast;
    }
    static void mymethod()
    {
        System.out.println("Hello There");
    }

    public static void main(String[] args)
    {
        oop newstudent=new oop();
        newstudent.age=18;
        newstudent.name="Richard";
        newstudent.setLast("Lastifiable");
        System.out.println(newstudent.getLast());
        System.out.println(newstudent.age);
        mymethod();
    }
    


}
