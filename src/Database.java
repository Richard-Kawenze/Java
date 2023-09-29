public class Database {
    private String name;
    private static Database instance;

    public static synchronized Database getInstance(String name)
    {
        if(null==Database)
        {
            instance=new Database(name);
            return instance;
        }
        else
        {
            return instance;
        }
    }

    private Database(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setName(name)
    {
        this.name=name;
    }


    
}
