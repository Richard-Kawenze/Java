import java.util.*;
public class sum {

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println(sum);
        sum++;
        System.out.println(sum);
        sum+=sum;
        System.out.println(sum);
        sum--;
        System.out.println(sum);
        sum+=sum;
        System.out.println(sum);

        String school="JKUAT";
        String location="JUJA";
        System.out.println(school+location);
        school+=location;
        System.out.println(school);
        System.out.println("This is a BMI tester");
        int height;
        int weight;

        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter your height");
        height=myobj.nextInt();
        System.out.println("Enter your weight");
        weight=myobj.nextInt();
        int bmi=height/weight;

        if(bmi>24)
        {
            System.out.println("You are obese my nigga");
        }
        else
        {
            System.out.println("You are lucky my nigga");
        }

        int bmi1=18;
        int bmi2=20;
        if((bmi1==bmi2)&&(bmi2==bmi2))
        {
            System.out.println("Normal bmi");
        }
        else if((bmi2==bmi1)&&(bmi==bmi2))
        {
            System.out.println("Abnormal bmi");
        }
        else
        {
            System.out.println("Uko na shida broo");
        }
        System.out.println("Enter your height");
        int urefu;
        urefu=myobj.nextInt();
        switch(urefu)
        {
            case 3:
            System.out.println("short");
            break;

            case 5:
            System.out.println("Tall");
            break;

            default:
            System.out.println("You dont exist");
            break;
        }

    }
    }

    

;
