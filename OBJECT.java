// write a java program to calculate volume of 3d object with                                
// the help of two function that is vol function and dis fuction
class test22
{
  double width, height ,length,volume;  
  public void vol()
  {
     width=5;
     height=5;
     length= 15.5;
     volume= width * height * length;
  }
  void disp()
  {
    System.out.println("volume of 3D object="+volume);
  }
}
public class OBJECT
{
  public static void main(String[]args)
  {
      test22 ab =new test22();
      ab.vol();
      ab.disp();

  }        

}

