package threads;

class WorkingContext implements Runnable
{
    MyStack stack = new MyStack(5);
   
    public void run()
    {
          String name = Thread.currentThread().getName();
         
          if(name.equalsIgnoreCase("sun"))          
          {
               long data=1;
               for( ; ; )
               {
                    stack.push(new Long(data));
                    data++;
                    try{Thread.sleep(1500);}catch(Exception e){}
               }
          }
          else if(name.equalsIgnoreCase("eart"))         
          {
               for( ; ; )
               {
                    stack.pop();
                    try{Thread.sleep(1000);}catch(Exception e){}
               }
          }
    }
}

