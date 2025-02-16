// static method usage
public class Try1
{
    public static void main(String[] args)
    {
      int a= 10 ,b= 5 ;
      //  in int there is c
      Try1.add(a,b);

    }
    public static void add(int x, int y)
    {
        int z;
        z=x+y;
        System.out.println("addition="+z);
    }
}    
