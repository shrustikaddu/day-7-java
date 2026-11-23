abstract class  Animal
{
    abstract void sound();
}
class  Dog extends Animal
{
    void sound()
    {
        System.out.println("DOg barks");
    }
}
public class Main2
{
     public static void main(String args[])
     {
        Dog d1 = new Dog();
        d1.sound();
     }
}
