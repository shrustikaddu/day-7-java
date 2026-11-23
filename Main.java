class calculator
{
    int add(int a,int b)
    {
        return a+b;
    }
    int substract(int a,int b)
    {
        return a-b;
    }
}

public class Main
{
    public static void main(String args[])
    {
        calculator c = new calculator();
        System.out.println(c.add(10,20));
        System.out.println(c.substract(20,10));
    }
}
