import java.util.Scanner;
public class tests {
    public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter your first number: \n");
            int a=input.nextInt();
            System.out.println("Enter your second number :");
            int b=input.nextInt();
            if(a==b)
            {
                System.out.println("The two numbers are equal.");
            }
            else
            {
                System.out.println("The two numbers are not equal");
            }
        }
    }

