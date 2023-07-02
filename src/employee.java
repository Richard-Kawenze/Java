

public class employee {
    private String name;
    private String jobTitle;
    private double salary;

    public employee(String name,String jobTitle,double salary)
    {
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getjobTitle()
    {
        return jobTitle;
    }

    public void setjobTitle(String jobTitle)
    {
        this.jobTitle=jobTitle;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public void raiseSalary(double percentage)
    {
        salary=salary+salary*percentage/100;
    }

    public void printEmployeeDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
    }

    public static void main(String[] args) {
        employee employee1=new employee("Richard Kawenze","Manager",2000);
        employee employee2=new employee("Isaac Nyakundi","Secretary",3000);
        System.out.println("Employee details");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.raiseSalary(34);
        employee2.raiseSalary(12);

        System.out.println("\nAfter the Salary raise here are the new details:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();
    }
    
}
