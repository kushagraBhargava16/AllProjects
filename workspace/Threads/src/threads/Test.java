package threads;

public class Test
{
    public static void main(String[] args)
    {
         
          System.out.println("In Main....");
          WorkingContext c = new WorkingContext();
   
          Thread t1 = new Thread(c,"sun");    
          Thread t2 = new Thread(c,"eart");   
         
          t1.start();
          t2.start();
         
          try{
               t1.join();
               t2.join();
              
          }catch(Exception e){}
         
          System.out.println("Bye Main....");
         
    }         
}
