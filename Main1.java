abstract class A1
    {
        abstract void display();
    }
        
    class B extends A1
    {
        void display()
        {
           System.out.println("B");   
        }

    }
    public class Main1{
        public static void main(String args[])
        {
            B b1= new B();
            b1.display();

        }
    }