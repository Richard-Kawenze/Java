import java.io.*;
public class GetFileInfo {
    public static void main(String[] args) {
        File myobj=new File("filename.txt");
        if(myobj.exists())
        {
            System.out.println("The file name is:"+myobj.getName());
            System.out.println("The file's absolute path is:"+myobj.getAbsolutePath());
            System.out.println("Is the file rewritable?"+myobj.canWrite());
            System.out.println("IS the file readable?"+myobj.canRead());
            System.out.println("The file size in bytes is: "+myobj.length());

        }
        else{
            System.out.println("This file does not exist.");   
        }
    }
    
}
