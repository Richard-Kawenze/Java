import java.util.*;
public class School {
    private ArrayList <Student> students;
    private ArrayList <Teacher> teachers;
    private ArrayList <SchoolClass> classes;

    public School()
    {
        this.students=new ArrayList<Student>();
        this.teachers=new ArrayList<Teacher> ();
        this.classes=new ArrayList<SchoolClass>();
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(Student student)


    
}
