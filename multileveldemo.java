class Animal
{
    void eat()
    {
        system.out.println("this animal is eating");
}
}
class Dog extends Animal
{
    void bark()
    {
        system.out.println("this dog is barking");
    }
}
class Puppy extends Animal
{
    void weep()
    {
        system.out.println("this puppy is weeping");
    }
}
public class multileveldemo
{
    public static void main (string args [])
    {
        Dog d = new dog();
        d.eat();
        d.bark();
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}