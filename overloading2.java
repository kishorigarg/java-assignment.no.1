class Animal2
{
   
   public void Eat()
   {
       System.out.println("Eat in parent class");
   }
}
class Dog2 extends Animal2
{
    public void Eat()
    {
        System.out.println("Eat in Subclass");  
    }
   
    public void Bark()
    {
        System.out.println("Barking!");
    }
}

public class Main3
{
    public static void main(String[] args)
    {
       Animal2 a = new Animal2();
       a.Eat();
       Dog2 d1 = new Dog2();
       d1.Eat();
       Animal2 c = new Dog2();
       c.Eat();
    }
}
