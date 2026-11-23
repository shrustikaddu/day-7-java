    class A
    {
        void display()
        {
            System.out.println("A");
        }
    class B extends A
    {
        void display()
        {
           System.out.println("B");   
        }

    }
    public class Main{
        public static void main(String args[])
        {
            A b1 = new A();
            b1.display();

        }
    }

    }