import java.util.Scanner;
 class Student
 {
   int rno,marks;
   String name;
   Scanner sc =new Scanner (System.in);
   void getdata()
   {
     System.out.println("enter the Roll Number,Student Name, and Marks");
     rno =sc.nextInt();
     sc.nextLine(); // Consume newline left-over
     name=sc.nextLine();
     marks=sc.nextInt();
   } 
   void disp()
   {
     System.out.println("Roll Number="+rno);
     System.out.println("Student Name="+name);
     System.out.println("Marks="+marks);
   }
 }
  public class EXTest1
 {
     // in this we did declaration of array
   public static void main(String[] args) 
   {
    int g;                
    Student[] obj = new Student[5];
    for (g=0 ; g < obj.length ; g++)
    {
     obj[g]=new Student();
   }
     for (g=0 ; g< obj.length; g++)
     {
       obj[g].getdata();
     }
     for (g=0 ; g< obj.length; g++)
      {
       obj[g].disp();
  
     }
 }
 }       
   
// import java.util.Scanner;
// class Student
// {
//  int rno,marks;
//  String name;
//  Scanner sc =new Scanner (System.in);
//  void getdata()
//  {
//    System.out.println("enter the Roll Number,Student Name, and Marks");
//    rno =sc.nextInt();
//    sc.nextLine(); // Consume newline left-over
//    name=sc.nextLine();
//    marks=sc.nextInt();
//  } 
//  void disp()
//  {
//    System.out.println("Roll Number="+rno);
//    System.out.println("Student Name="+name);
//    System.out.println("Marks="+marks);
//  }
// }
// public class test1
// {
//    // in this we did declaration of array
//  public static void main(String[] args) 
//  {
//   int g;                
//   Student[] obj = new Student[5];
//   for (g=0 ; g<5; g++)
//   {
//    obj[g]=new Student();
//  }
//    for (g=0 ; g<5; g++)
//    {
//      obj[g].getdata();
//      obj[g].disp();

//    }
// }
// }       
 
