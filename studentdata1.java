// create a class student having methods getmarks should accept Roll No,
// student name and marks of the student and display method should should
// print the same 
import java.util.*;
class studentinfo 
{
  int rno,marks;
  String name;
  Scanner sc =new Scanner (System.in);
  void getmarks()
  {
    System.out.println("Enter the Roll Number:");
    rno =sc.nextInt();
    System.out.println("Enter the Student Name:");
    name=sc.next();
    System.out.println("Enter the Marks:");
    marks=sc.nextInt();
  } 
  void display()
  {
    System.out.println("Roll Number="+rno);
    System.out.println("Student Name="+name);
    System.out.println("Marks="+marks);
  }
}
public class studentdata1
{
    public static void main(String[] args)
    {
     studentinfo si= new studentinfo();
     si.getmarks();
     si.display(); 
    }
}
