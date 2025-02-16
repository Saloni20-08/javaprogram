import java.util.*;
class employee{
    String name;
    int empid,sal;
    Scanner in= new Scanner (System.in);
    void getdata()
    {
        System.out.println("\n Enter empid,name ans salary:");
        empid=in.nextInt();
        in.nextLine(); 
        name= in.next();
        sal=in.nextInt();
    }
    void display()
    {
        System.out.println("Employee Id:-"+empid);
        System.out.println("Name of Employee:-"+name);
        System.out.println("Salary of Employee:-"+sal);
    }
}
public class test2 
{
     public static void main(String[] args) 
    {
     int i;
     employee[] obj= new employee[5];
     for(i=0;i<5;i++)
     {
        obj[i]=new employee();
     }   
     for ( i= 0 ; i < 5; i++) 
     {
       obj[i].getdata();
       obj[i].display();  
     }
    }
}
    


