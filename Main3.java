interface Payment{
    void makePayment();
}
class UPIPayment implements Payment
{
   public void makePayment()
  {
    System.out.println("UPI done");
    
  }  
}

public class Main3{
    public static void main(String args[])
    {
        UPIPayment p1 = new UPIPayment();
        p1.makePayment();

    }
}