import java.util.*;
import java.io.*;
public class ReadFile {
    public static void main(String[] args) {
        try
        {
            File myobj=new File("filename.txt");
            Scanner myReader=new Scanner(myobj);
            while(myReader.hasNextLine())
            {
                String data=myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
    
}
