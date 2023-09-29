import java.io.*;
public class WriteToFile {
    public static void main(String[] args) {
        try
        {
            FileWriter myWriter=new FileWriter("filename.txt");
            myWriter.write("Everything is about to go down once i master this shit");
            myWriter.close();
            System.out.println("Successfully wrote on the required file");


        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
    
}
