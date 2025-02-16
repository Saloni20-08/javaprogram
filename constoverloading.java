class Textbox
{
    String text;
    int maxlength;
    char passchar;
    public Textbox()
    {
        text="Textbox text";
        maxlength=28;
        passchar= '*';
        System.out.println("text="+text);
        System.out.println("maxlength="+maxlength);
        System.out.println("passchar="+passchar);
    }
    public Textbox(String t,int l,char c)
    {
        text=t;
        maxlength=l;
        passchar=c;
        System.out.println("text="+text);
        System.out.println("maxlength="+maxlength);
        System.out.println("passchar="+passchar);
    }
    public  Textbox(String t)
    {
        text=t;
        maxlength=28; 
        passchar='*';
        System.out.println("text="+text);
        System.out.println("maxlength="+maxlength);
        System.out.println("passchar="+passchar);
    }
    public  Textbox(int l)
    {
        text="textbox text";
        maxlength=l; 
        passchar='*';
        System.out.println("text="+text);
        System.out.println("maxlength="+maxlength);
        System.out.println("passchar="+passchar);
    }
    public  Textbox(char c) 
    {
        text="textbox text";
        maxlength=28; 
        passchar=c;
        System.out.println("text="+text);
        System.out.println("maxlength="+maxlength);
        System.out.println("passchar="+passchar); 
    } 
}
public class constoverloading 
{
    public static void main(String[] args) {
        Textbox t1=new Textbox();
        System.out.println("");
        Textbox t2= new Textbox("Textbox2", 15, '*');
        System.out.println("");
        Textbox t3 =new Textbox("Textbox3");
        System.out.println("");
        Textbox t4 =new Textbox(10);
        System.out.println("");
        Textbox t5= new Textbox("#");
        

    }
}
