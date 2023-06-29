public class test {
    private String name;
    private String breed;

    public test(String name,String breed)
    {
        this.name=name;
        this.breed=breed;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getBreed()
    {
        return breed;
    }

    public void setBreed(String breed)
    {
        this.breed=breed;
    }
public static void main(String[] args)
{
    test dog1=new test("Kaumbwa","Kisungu");
    test dog2=new test("Kasolo","Kienyeji");

    System.out.println(dog1.getName() + " is a "+ dog1.getBreed());
    System.out.println(dog2.getName()+ " is a "+dog2.getBreed());

    //Set new Names for both dogs
    dog1.setName("Kisinga");
    dog2.setName("Mwanga");

    //Print out using the new names
    System.out.println(dog1.getName()+" is a "+dog1.getBreed());
    System.out.println(dog2.getName()+" is a "+dog2.getBreed());

}



    
}
